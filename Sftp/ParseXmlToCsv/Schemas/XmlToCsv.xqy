xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare namespace ns1="http://www.example.org";
(:: import schema at "INT_Schema.xsd" ::)
declare namespace ns2="http://www.example2.org";
(:: import schema at "OUT_Schema.xsd" ::)

declare variable $Offering as element() (:: schema-element(ns1:Offering) ::) external;
declare variable $action as element() (:: element(*, ns1:Action) ::) external;

declare variable $pricePlanId as xs:string external;
declare variable $policyId as xs:string external;



declare function local:func(
$Offering as element() (:: schema-element(ns1:Offering) ::),
$action as element() (:: element(*, ns1:Action) ::),
$pricePlanId as xs:string,
$policyId as xs:string) as element() (:: schema-element(ns2:Offerings) ::) {
        <ns2:Offering>
            {
                if ($Offering/ns1:OfferId)
                then <ns2:OfferId>{fn:data($Offering/ns1:OfferId)}</ns2:OfferId>
                else ()
            }
            {
                if ($Offering/ns1:ActivationId)
                then <ns2:ActivationId>{fn:data($Offering/ns1:ActivationId)}</ns2:ActivationId>
                else ()
            }
            {
                if ($Offering/ns1:Name)
                then <ns2:Name>{fn:data($Offering/ns1:Name)}</ns2:Name>
                else ()
            }
            {
                if ($Offering/ns1:Description)
                then <ns2:Description>{fn:data($Offering/ns1:Description)}</ns2:Description>
                else ()
            }
            {
                if ($Offering/ns1:EffDate)
                then <ns2:EffDate>{fn:data($Offering/ns1:EffDate)}</ns2:EffDate>
                else ()
            }
            {
                if ($Offering/ns1:ExpDate)
                then <ns2:ExpDate>{fn:data($Offering/ns1:ExpDate)}</ns2:ExpDate>
                else ()
            }
            {
                if ($Offering/ns1:PaymentMode)
                then <ns2:PaymentMode>{fn:data($Offering/ns1:PaymentMode)}</ns2:PaymentMode>
                else ()
            }
            {
                if ($Offering/ns1:Brand)
                then <ns2:Brand>{fn:data($Offering/ns1:Brand)}</ns2:Brand>
                else ()
            }
           
            <ns2:PricePlanList>
                <ns2:PricePlan>
                    <ns2:Id>{fn:data($pricePlanId)}</ns2:Id>
                    <ns2:PolicyList>
                        <ns2:Policy>
                            <ns2:Id>{fn:data($policyId)}</ns2:Id>
                            <ns2:ActionList>
                                <ns2:Action>
                                    {
                                        if ($action/ns1:FreeUnitBonusAction)
                                        then <ns2:FreeUnitBonusAction>
                                            {
                                                if ($action/ns1:FreeUnitBonusAction/ns1:FreeUnitTypeId)
                                                then <ns2:FreeUnitTypeId>{fn:data($action/ns1:FreeUnitBonusAction/ns1:FreeUnitTypeId)}</ns2:FreeUnitTypeId>
                                                else ()
                                            }
                                            {
                                                if ($action/ns1:FreeUnitBonusAction/ns1:BonusAmount)
                                                then <ns2:BonusAmount>{fn:data($action/ns1:FreeUnitBonusAction/ns1:BonusAmount)}</ns2:BonusAmount>
                                                else ()
                                            }
                                            {
                                                if ($action/ns1:FreeUnitBonusAction/ns1:BonusAmountMeasurement)
                                                then <ns2:BonusAmountMeasurement>{fn:data($action/ns1:FreeUnitBonusAction/ns1:BonusAmountMeasurement)}</ns2:BonusAmountMeasurement>
                                                else ()
                                            }</ns2:FreeUnitBonusAction>
                                        else ()
                                    }
                                    {
                                        if ($action/ns1:BalanceBonusAction)
                                        then <ns2:BalanceBonusAction>
                                            {
                                                if ($action/ns1:BalanceBonusAction/ns1:AccountBalanceType)
                                                then <ns2:AccountBalanceType>{fn:data($action/ns1:BalanceBonusAction/ns1:AccountBalanceType)}</ns2:AccountBalanceType>
                                                else ()
                                            }
                                            {
                                                if ($action/ns1:BalanceBonusAction/ns1:BonusAmount)
                                                then <ns2:BonusAmount>{fn:data($action/ns1:BalanceBonusAction/ns1:BonusAmount)}</ns2:BonusAmount>
                                                else ()
                                            }
                                            {
                                                if ($action/ns1:BalanceBonusAction/ns1:BonusAmountMeasurement)
                                                then <ns2:BonusAmountMeasurement>{fn:data($action/ns1:BalanceBonusAction/ns1:BonusAmountMeasurement)}</ns2:BonusAmountMeasurement>
                                                else ()
                                            }</ns2:BalanceBonusAction>
                                        else ()
                                    }
                                </ns2:Action>
                            </ns2:ActionList>
                        </ns2:Policy>
                    </ns2:PolicyList>
                </ns2:PricePlan>
            </ns2:PricePlanList>
        </ns2:Offering>
};

local:func($Offering,$action,$pricePlanId,$policyId)
