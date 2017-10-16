xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare default element namespace "";
(:: import schema at "../Resources/MFL.xsd" ::)
declare namespace ns1="http://www.example.org";
(:: import schema at "INT_Schema.xsd" ::)

declare namespace www = "http://www.example2.org";

declare variable $Offering as element() (:: schema-element(Offering) ::) external;

declare function local:func($Offering as element() (:: schema-element(Offering) ::)) as element() (:: schema-element(ns1:Offering) ::) {
    <ns1:Offering>
      
        <ns1:Offerings>
        </ns1:Offerings>
        {
            if ($Offering/Id)
            then <ns1:OfferId>{fn:data($Offering/Id)}</ns1:OfferId>
            else ()
        }
        {
            if ($Offering/Id)
            then <ns1:ActivationId>{fn:data($Offering/Id)}</ns1:ActivationId>
            else ()
        }
        {
            if ($Offering/Name)
            then <ns1:Name>{fn:data($Offering/Name)}</ns1:Name>
            else ()
        }
        {
            if ($Offering/Description)
            then <ns1:Description>{fn:data($Offering/Description)}</ns1:Description>
            else ()
        }
        {
            if ($Offering/EffDate)
            then <ns1:EffDate>{fn:data($Offering/EffDate)}</ns1:EffDate>
            else ()
        }
        {
            if ($Offering/ExpDate)
            then <ns1:ExpDate>{fn:data($Offering/ExpDate)}</ns1:ExpDate>
            else ()
        }
        {
            if ($Offering/PaymentMode)
            then <ns1:PaymentMode>{fn:data($Offering/PaymentMode)}</ns1:PaymentMode>
            else ()
        }
        <ns1:Brand>{fn:string('CLARO')}</ns1:Brand>
        <ns1:PricePlanList>
            {
                for $PricePlan in $Offering/PricePlanList/PricePlan
                return 
                <ns1:PricePlan>
                    {
                        if ($PricePlan/Id)
                        then <ns1:Id>{fn:data($PricePlan/Id)}</ns1:Id>
                        else ()
                    }
                    {
                        if ($PricePlan/PolicyList)
                        then <ns1:PolicyList>
                            {
                                for $Policy in $PricePlan/PolicyList/Policy
                                return 
                                <ns1:Policy>
                                    {
                                        if ($Policy/Id)
                                        then <ns1:Id>{fn:data($Policy/Id)}</ns1:Id>
                                        else ()
                                    }
                                    <ns1:ActionList>
                                        {
                                            for $PatternAction in $Policy/PatternActionList/PatternAction
                                            return 
                                            <ns1:Action>
                                                <ns1:FreeUnitBonusAction>
                                                    {
                                                        if ($PatternAction/Action/FreeUnitBonusAction/FreeUnitTypeId)
                                                        then <ns1:FreeUnitTypeId>{fn:data($PatternAction/Action/FreeUnitBonusAction/FreeUnitTypeId)}</ns1:FreeUnitTypeId>
                                                        else <ns1:FreeUnitTypeId></ns1:FreeUnitTypeId>
                                                    }
                                                    {
                                                        if ($PatternAction/Action/FreeUnitBonusAction/BonusAmount)
                                                        then <ns1:BonusAmount>{fn:data($PatternAction/Action/FreeUnitBonusAction/BonusAmount)}</ns1:BonusAmount>
                                                        else <ns1:BonusAmount></ns1:BonusAmount>
                                                    }
                                                    {
                                                        if ($PatternAction/Action/FreeUnitBonusAction/BonusMeasurement)
                                                        then <ns1:BonusAmountMeasurement>{fn:data($PatternAction/Action/FreeUnitBonusAction/BonusMeasurement)}</ns1:BonusAmountMeasurement>
                                                        else <ns1:BonusAmountMeasurement></ns1:BonusAmountMeasurement>
                                                    }</ns1:FreeUnitBonusAction>
                                                <ns1:BalanceBonusAction>
                                                    {
                                                        if ($PatternAction/Action/BalanceBonusAction/AccountBalanceType)
                                                        then <ns1:AccountBalanceType>{fn:data($PatternAction/Action/BalanceBonusAction/AccountBalanceType)}</ns1:AccountBalanceType>
                                                        else <ns1:AccountBalanceType></ns1:AccountBalanceType>
                                                    }
                                                    {
                                                        if ($PatternAction/Action/BalanceBonusAction/BonusAmount)
                                                        then <ns1:BonusAmount>{fn:data($PatternAction/Action/BalanceBonusAction/BonusAmount)}</ns1:BonusAmount>
                                                        else <ns1:BonusAmount></ns1:BonusAmount>
                                                    }
                                                    {
                                                        if ($PatternAction/Action/BalanceBonusAction/BonusAmountMeasurement)
                                                        then <ns1:BonusAmountMeasurement>{fn:data($PatternAction/Action/BalanceBonusAction/BonusAmountMeasurement)}</ns1:BonusAmountMeasurement>
                                                        else <ns1:BonusAmountMeasurement></ns1:BonusAmountMeasurement>
                                                    }
                                                </ns1:BalanceBonusAction>
                                            </ns1:Action>
                                        }
                                    </ns1:ActionList>
                                  
                                 
                                </ns1:Policy>
                            }
                        </ns1:PolicyList>
                        else ()
                    }</ns1:PricePlan>
            }
        </ns1:PricePlanList>
    </ns1:Offering>
};

local:func($Offering)
