<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <h1>
          <center>UCI Road</center>
        </h1>
      </head>
      <body>
        <table cellspacing="0" cellpadding="2" border="2" width="100%" align="center">
          <td style="text-align:center">Team name</td>
          <td></td>
          <xsl:for-each select="UCIRoad/worldTeam">
            <tr>
              <xsl:if test="@teamName = 'Sky'">
                <td bgcolor="#4671D5">
                  <xsl:value-of select="@teamName"/>
                </td>
              </xsl:if>
              <xsl:if test="@teamName = 'BMC Racing Team'">
                <td bgcolor="#FF3500">
                  <xsl:value-of select="@teamName"/>
                </td>
              </xsl:if>
              <xsl:if test="@teamName = 'Lotto Soudal'">
                <td bgcolor="#FFE500">
                  <xsl:value-of select="@teamName"/>
                </td>
              </xsl:if>
              <td>
                <table cellspacing="0" cellpadding="2" border="0" width="100%" align="center" bgcolor="#FFA400">
                  <th width="16%" style="text-align:center">First name</th>
                  <th width="16%" style="text-align:center">Last name</th>
                  <th width="16%" style="text-align:center">Nickname</th>
                  <th width="16%" style="text-align:center">Type</th>
                  <th width="16%" style="text-align:center">Date of birth</th>
                  <th width="16%" style="text-align:center">Nationality</th>
                  <th width="16%" style="text-align:center">Height</th>
                  <xsl:for-each select="rider">
                    <tr bgcolor="#A66B00">
                      <td width="16%" style="text-align:center">
                        <xsl:value-of select="firstName"/>
                      </td>
                      <td width="16%" style="text-align:center">
                        <xsl:value-of select="lastName"/>
                      </td>
                      <td width="16%" style="text-align:center">
                        <xsl:value-of select="nickName"/>
                      </td>
                      <td width="16%" style="text-align:center">
                        <xsl:value-of select="type"/>
                      </td>
                      <td width="16%" style="text-align:center">
                        <xsl:value-of select="dateOfBirth"/>
                      </td>
                      <td width="16%" style="text-align:center">
                        <xsl:value-of select="nationality"/>
                      </td>
                      <xsl:if test="height &lt; 176">
                        <td width="16%" style="text-align:center" bgcolor="#64AA2B">
                          <xsl:value-of select="height"/>
                        </td>
                      </xsl:if>
                      <xsl:if test="height &gt; 176">
                        <td width="16%" style="text-align:center" bgcolor="#C50080">
                          <xsl:value-of select="height"/>
                        </td>
                      </xsl:if>
                    </tr>
                    <tr bgcolor="#FF4900">
                      <th width="16%" style="text-align:center">Year</th>
                      <th width="16%" style="text-align:center">Team</th>
                      <th width="16%" style="text-align:center">Achievements</th>
                    </tr>
                    <xsl:call-template name="season" />
                  </xsl:for-each>
                </table>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
  <xsl:template name="season">
    <xsl:for-each select="majorAchievement/season">
      <tr>
        <td width="16%">
          <xsl:value-of select="@year"/>
        </td>
        <td width="16%">
          <xsl:value-of select="@team"/>
        </td>
        <xsl:call-template name="achievementy" />
      </tr>
    </xsl:for-each>
  </xsl:template>
  <xsl:template name="achievementy">
    <xsl:for-each select="achievement">
      <td width="16%">
        <xsl:value-of select="."/>
      </td>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>
