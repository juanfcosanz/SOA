xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare namespace ns1="http://claro.com.ec/osb/message/Bss/ParseOfferFile/ParseOfferFileMessage/v1";
(:: import schema at "../XSD/ParseOfferFileMessageV1.xsd" ::)

declare variable $OfferingRequest as element() (:: schema-element(ns1:OfferingRequest) ::) external;
declare variable $action as element() (:: element(*, ns1:Action) ::) external;
declare variable $pricePlanId as xs:string external;
declare variable $policyId as xs:string external;

declare function local:func($OfferingRequest as element() (:: schema-element(ns1:OfferingRequest) ::),
$action as element() (:: element(*, ns1:Action) ::),
$pricePlanId as xs:string,
$policyId as xs:string) as element() (:: schema-element(ns1:OfferingResponse) ::) {
    <ns1:OfferingResponse>
        {
            if ($OfferingRequest/ns1:OfferId)
            then <ns1:OfferId>{fn:data($OfferingRequest/ns1:OfferId)}</ns1:OfferId>
            else ()
        }
        {
            if ($OfferingRequest/ns1:ActivationId)
            then <ns1:ActivationId>{fn:data($OfferingRequest/ns1:ActivationId)}</ns1:ActivationId>
            else ()
        }
        {
            if ($OfferingRequest/ns1:Name)
            then <ns1:Name>{fn:data($OfferingRequest/ns1:Name)}</ns1:Name>
            else ()
        }
        {
            if ($OfferingRequest/ns1:Description)
            then <ns1:Description>{fn:data($OfferingRequest/ns1:Description)}</ns1:Description>
            else ()
        }
        {
            if ($OfferingRequest/ns1:EffDate)
            then <ns1:EffDate>{fn:data($OfferingRequest/ns1:EffDate)}</ns1:EffDate>
            else ()
        }
        {
            if ($OfferingRequest/ns1:ExpDate)
            then <ns1:ExpDate>{fn:data($OfferingRequest/ns1:ExpDate)}</ns1:ExpDate>
            else ()
        }
        {
            if ($OfferingRequest/ns1:PaymentMode)
            then <ns1:PaymentMode>{fn:data($OfferingRequest/ns1:PaymentMode)}</ns1:PaymentMode>
            else ()
        }
        {
            if ($OfferingRequest/ns1:Brand)
            then <ns1:Brand>{fn:data($OfferingRequest/ns1:Brand)}</ns1:Brand>
            else ()
        }
        <ns1:PricePlanList>
            <ns1:PricePlan>
                <ns1:Id>{fn:data($pricePlanId)}</ns1:Id>
                <ns1:PolicyList>
                    <ns1:Policy>
                        <ns1:Id>{fn:data($policyId)}</ns1:Id>
                        <ns1:ActionList>
                            <ns1:Action>
                                {
                                    if ($action/ns1:FreeUnitBonusAction)
                                    then 
                                        <ns1:FreeUnitBonusAction>
                                            {
                                                if ($action/ns1:FreeUnitBonusAction/ns1:FreeUnitTypeId)
                                                then <ns1:FreeUnitTypeId>{fn:data($action/ns1:FreeUnitBonusAction/ns1:FreeUnitTypeId)}</ns1:FreeUnitTypeId>
                                                else <ns1:FreeUnitTypeId></ns1:FreeUnitTypeId>
                                            }
                                            {
                                                if ($action/ns1:FreeUnitBonusAction/ns1:BonusAmount)
                                                then <ns1:BonusAmount>{fn:data($action/ns1:FreeUnitBonusAction/ns1:BonusAmount)}</ns1:BonusAmount>
                                                else <ns1:BonusAmount></ns1:BonusAmount>

                                            }
                                            {
                                                if ($action/ns1:FreeUnitBonusAction/ns1:BonusAmountMeasurement)
                                                then <ns1:BonusAmountMeasurement>{fn:data($action/ns1:FreeUnitBonusAction/ns1:BonusAmountMeasurement)}</ns1:BonusAmountMeasurement>
                                                else <ns1:BonusAmountMeasurement></ns1:BonusAmountMeasurement>
                                            }
                                        </ns1:FreeUnitBonusAction>
                                    else 
                                      <ns1:FreeUnitBonusAction>
                                            <ns1:FreeUnitTypeId></ns1:FreeUnitTypeId>
                                            <ns1:BonusAmount></ns1:BonusAmount>
                                            <ns1:BonusAmountMeasurement></ns1:BonusAmountMeasurement>
                                        </ns1:FreeUnitBonusAction>
                                }
                                {
                                    if ($action/ns1:BalanceBonusAction)
                                    then 
                                        <ns1:BalanceBonusAction>
                                            {
                                                if ($action/ns1:BalanceBonusAction/ns1:AccountBalanceType)
                                                then <ns1:AccountBalanceType>{fn:data($action/ns1:BalanceBonusAction/ns1:AccountBalanceType)}</ns1:AccountBalanceType>
                                                else <ns1:AccountBalanceType></ns1:AccountBalanceType>
                                            }
                                            {
                                                if ($action/ns1:BalanceBonusAction/ns1:BonusAmount)
                                                then <ns1:BonusAmount>{fn:data($action/ns1:BalanceBonusAction/ns1:BonusAmount)}</ns1:BonusAmount>
                                                else <ns1:BonusAmount></ns1:BonusAmount>
                                            }
                                            {
                                                if ($action/ns1:BalanceBonusAction/ns1:BonusAmountMeasurement)
                                                then <ns1:BonusAmountMeasurement>{fn:data($action/ns1:BalanceBonusAction/ns1:BonusAmountMeasurement)}</ns1:BonusAmountMeasurement>
                                                else <ns1:BonusAmountMeasurement></ns1:BonusAmountMeasurement>
                                            }
                                        </ns1:BalanceBonusAction>
                                    else 
                                        <ns1:BalanceBonusAction>
                                                <ns1:AccountBalanceType></ns1:AccountBalanceType>
                                                <ns1:BonusAmount></ns1:BonusAmount>
                                                <ns1:BonusAmountMeasurement></ns1:BonusAmountMeasurement>
                                        </ns1:BalanceBonusAction>
                                }
                            </ns1:Action>
                        </ns1:ActionList>
                    </ns1:Policy>
                </ns1:PolicyList>
            </ns1:PricePlan>
        </ns1:PricePlanList>
    </ns1:OfferingResponse>
};

local:func($OfferingRequest,$action,$pricePlanId,$policyId)
