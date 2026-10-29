.class public final La4;
.super Lpg3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final i:Li03;


# direct methods
.method public constructor <init>(Li03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4;->i:Li03;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final G(Z)Z
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "com.adjust.sdk.Adjust"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/adjust/sdk/Adjust;->trackMeasurementConsent(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    iget-object p0, p0, La4;->i:Li03;

    .line 13
    .line 14
    const-string v0, "Failed to apply consent to Adjust"

    .line 15
    .line 16
    invoke-interface {p0, v0, p1}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final H(Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "com.adjust.sdk.AdjustThirdPartySharing"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/adjust/sdk/AdjustThirdPartySharing;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lcom/adjust/sdk/AdjustThirdPartySharing;-><init>(Ljava/lang/Boolean;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "install"

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1, p2}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addPartnerSharingSetting(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    const-string v1, "events"

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, p2}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addPartnerSharingSetting(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v1, "sessions"

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1, p2}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addPartnerSharingSetting(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->trackThirdPartySharing(Lcom/adjust/sdk/AdjustThirdPartySharing;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    iget-object p0, p0, La4;->i:Li03;

    .line 34
    .line 35
    const-string p2, "Failed to apply consent to Adjust"

    .line 36
    .line 37
    invoke-interface {p0, p2, p1}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public final I(Lcg1;)Z
    .locals 6

    .line 1
    :try_start_0
    const-string v0, "com.adjust.sdk.AdjustThirdPartySharing"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "google_dma"

    .line 7
    .line 8
    new-instance v1, Lcom/adjust/sdk/AdjustThirdPartySharing;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Lcom/adjust/sdk/AdjustThirdPartySharing;-><init>(Ljava/lang/Boolean;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "eea"

    .line 15
    .line 16
    iget-boolean v3, p1, Lcg1;->a:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    const-string v4, "0"

    .line 19
    .line 20
    const-string v5, "1"

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    move-object v3, v5

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v3, v4

    .line 27
    :goto_0
    :try_start_1
    invoke-virtual {v1, v0, v2, v3}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addGranularOption(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v2, "ad_personalization"

    .line 31
    .line 32
    iget-boolean v3, p1, Lcg1;->e:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    move-object v3, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v3, v4

    .line 39
    :goto_1
    invoke-virtual {v1, v0, v2, v3}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addGranularOption(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "ad_user_data"

    .line 43
    .line 44
    iget-boolean p1, p1, Lcg1;->d:Z

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    move-object v4, v5

    .line 49
    :cond_2
    invoke-virtual {v1, v0, v2, v4}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addGranularOption(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lcom/adjust/sdk/Adjust;->trackThirdPartySharing(Lcom/adjust/sdk/AdjustThirdPartySharing;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x1

    .line 56
    return p0

    .line 57
    :catch_0
    move-exception p1

    .line 58
    iget-object p0, p0, La4;->i:Li03;

    .line 59
    .line 60
    const-string v0, "Failed to apply consent to Adjust"

    .line 61
    .line 62
    invoke-interface {p0, v0, p1}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return p0
.end method
