xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare default element namespace "";
(:: import schema at "../XSD/Offering_1.2.xsd" ::)
declare namespace ns1="http://claro.com.ec/osb/message/Bss/ParseOfferFile/ParseOfferFileMessage/v1";
(:: import schema at "../XSD/ParseOfferFileMessageV1.xsd" ::)

declare variable $Offering as element() (:: schema-element(Offering) ::) external;

declare function local:func($Offering as element() (:: schema-element(Offering) ::)) as element() (:: schema-element(ns1:OfferingRequest) ::) {
    <ns1:OfferingRequest>
        <ns1:Offerings>
        </ns1:Offerings>
        <ns1:OfferId>{fn:data($Offering/Id)}</ns1:OfferId>
        <ns1:ActivationId>{fn:data($Offering/Id)}</ns1:ActivationId>
        <ns1:Name>{fn:data($Offering/Name)}</ns1:Name>
        <ns1:Description>{fn:data($Offering/Description)}</ns1:Description>
        <ns1:EffDate>{fn:data($Offering/EffDate)}</ns1:EffDate>
        <ns1:ExpDate>{fn:data($Offering/ExpDate)}</ns1:ExpDate>
        <ns1:PaymentMode>{fn:data($Offering/PaymentMode)}</ns1:PaymentMode>
        <ns1:Brand>{fn:string('N/A')}</ns1:Brand>
        <ns1:PricePlanList>
            {
                for $PricePlan in $Offering/PricePlanList/PricePlan
                return 
                <ns1:PricePlan>
                    <ns1:Id>{fn:data($PricePlan/Id)}</ns1:Id>
                    <ns1:PolicyList>
                        {
                            for $Policy in $PricePlan/PolicyList/Policy
                            return 
                            <ns1:Policy>
                                <ns1:Id>{fn:data($Policy/Id)}</ns1:Id>
                                <ns1:ActionList>
                                    {
                                        for $PatternAction in $Policy/PatternActionList/PatternAction
                                        return 
                                        if($PatternAction/Action/FreeUnitBonusAction or $PatternAction/Action/BalanceBonusAction)
                                        then
                                        <ns1:Action>
                                            <ns1:FreeUnitBonusAction>
                                                {
                                                    if ($PatternAction/Action/FreeUnitBonusAction/FreeUnitTypeId) then
                                                        <ns1:FreeUnitTypeId>{fn:data($PatternAction/Action/FreeUnitBonusAction/FreeUnitTypeId)}</ns1:FreeUnitTypeId>
                                                    else ()
                                                }
                                                {
                                                    if ($PatternAction/Action/FreeUnitBonusAction/BonusAmount) then
                                                        <ns1:BonusAmount>{fn:data($PatternAction/Action/FreeUnitBonusAction/BonusAmount)}</ns1:BonusAmount>
                                                    else ()
                                                }
                                                {
                                                    if ($PatternAction/Action/FreeUnitBonusAction/BonusAmountMeasurement) then
                                                        <ns1:BonusAmountMeasurement>{fn:data($PatternAction/Action/FreeUnitBonusAction/BonusAmountMeasurement)}</ns1:BonusAmountMeasurement>
                                                    else ()
                                                }
                                            </ns1:FreeUnitBonusAction>
                                            <ns1:BalanceBonusAction>
                                                {
                                                    if ($PatternAction/Action/BalanceBonusAction/AccountBalanceType) then
                                                        <ns1:AccountBalanceType>{fn:data($PatternAction/Action/BalanceBonusAction/AccountBalanceType)}</ns1:AccountBalanceType>
                                                    else ()
                                                }
                                                {
                                                    if ($PatternAction/Action/BalanceBonusAction/BonusAmount) then
                                                        <ns1:BonusAmount>{fn:data($PatternAction/Action/BalanceBonusAction/BonusAmount)}</ns1:BonusAmount>
                                                    else ()
                                                }
                                                {
                                                    if ($PatternAction/Action/BalanceBonusAction/BonusAmountMeasurement) then
                                                        <ns1:BonusAmountMeasurement>{fn:data($PatternAction/Action/BalanceBonusAction/BonusAmountMeasurement)}</ns1:BonusAmountMeasurement>
                                                    else ()
                                                }
                                            </ns1:BalanceBonusAction>
                                        </ns1:Action>
                                        else()
                                    }
                                </ns1:ActionList></ns1:Policy>
                        }
                    </ns1:PolicyList></ns1:PricePlan>
            }</ns1:PricePlanList>
    </ns1:OfferingRequest>
};

local:func($Offering)
