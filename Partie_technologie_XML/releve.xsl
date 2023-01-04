<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head> <title> Releve Bancaire</title></head>
            <body>
                <h1>Releve bancaire</h1>
                <ul>
                    <xsl:for-each select="/Releve">
                        <li> RIB : <xsl:value-of select="@RIB"></xsl:value-of></li>
                        <li> Date du releve : <xsl:value-of select="dateReleve"></xsl:value-of></li>
                        <li> Solde : <xsl:value-of select="solde"></xsl:value-of></li>
                        <li> Date Debut : <xsl:value-of select="operations/@dateDebut"></xsl:value-of></li>
                        <li> Date Fin : <xsl:value-of select="operations/@dateFin"></xsl:value-of></li>
                    </xsl:for-each>
                </ul>
                
                <h1> Liste des operations</h1>
                <table width="70%" border="2">
                    <tr>
                        <th>Type</th>
                        <th>Date</th>
                        <th>Montant</th>
                        <th>Description</th>
                    </tr>
                    <xsl:for-each select="/Releve/operations/operation">
                        <tr>
                            <td> <xsl:value-of select="@type"></xsl:value-of></td>
                            <td> <xsl:value-of select="@date"></xsl:value-of></td>
                            <td> <xsl:value-of select="@montant"></xsl:value-of></td>
                            <td> <xsl:value-of select="@description"></xsl:value-of></td>
                        </tr>
                    </xsl:for-each>
                    <tr>
                        <td colspan="2"> Total des operations credit :</td>
                        <td colspan="2"> <xsl:value-of select="/Releve/operations/sum(operation[@type='CREDIT']/@montant)"></xsl:value-of></td>
                    </tr>
                    <tr>
                        <td colspan="2"> Total des operations Debit :</td>
                        <td colspan="2"> <xsl:value-of select="/Releve/operations/sum(operation[@type='DEBIT']/@montant)"></xsl:value-of></td>
                    </tr>
                </table>
                
                <h1> les operations de type credit :</h1>
                <table width="70%" border="2">
                    
                    <tr>
                        <th> Type</th>
                        <th> Date</th>
                        <th> Montant</th>
                        <th> Description</th>
                    </tr>
                    <xsl:for-each select="/Releve/operations/operation[@type='CREDIT']">
                        <tr>
                            <td> <xsl:value-of select="@type"></xsl:value-of></td>
                            <td> <xsl:value-of select="@date"></xsl:value-of></td>
                            <td> <xsl:value-of select="@montant"></xsl:value-of></td>
                            <td> <xsl:value-of select="@description"></xsl:value-of></td>
                        </tr>
                    </xsl:for-each>
                    <tr>
                        <td> Total :</td>
                        <td colspan="3"> <xsl:value-of select="/Releve/operations/sum(operation[@type='CREDIT']/@montant)"></xsl:value-of></td>
                    </tr>
                </table>
                
            </body>
        </html>
        
    </xsl:template>
</xsl:stylesheet>