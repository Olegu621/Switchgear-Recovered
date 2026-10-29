.class public final Lut;
.super Ldg1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Li03;

.field public final e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Li03;Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "Chartboost"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ldg1;-><init>(Ljava/lang/String;Li03;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lut;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lut;->d:Li03;

    .line 9
    .line 10
    iput-object p2, p0, Lut;->e:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method

.method public static g(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/chartboost/sdk/privacy/model/CCPA$CCPA_CONSENT;->OPT_IN_SALE:Lcom/chartboost/sdk/privacy/model/CCPA$CCPA_CONSENT;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lcom/chartboost/sdk/privacy/model/CCPA$CCPA_CONSENT;->OPT_OUT_SALE:Lcom/chartboost/sdk/privacy/model/CCPA$CCPA_CONSENT;

    .line 7
    .line 8
    :goto_0
    new-instance v0, Lcom/chartboost/sdk/privacy/model/CCPA;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/chartboost/sdk/privacy/model/CCPA;-><init>(Lcom/chartboost/sdk/privacy/model/CCPA$CCPA_CONSENT;)V

    .line 11
    .line 12
    .line 13
    check-cast v0, Lcom/chartboost/sdk/privacy/model/DataUseConsent;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lcom/chartboost/sdk/Chartboost;->addDataUseConsent(Landroid/content/Context;Lcom/chartboost/sdk/privacy/model/DataUseConsent;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static h(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;->BEHAVIORAL:Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;->NON_BEHAVIORAL:Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;

    .line 7
    .line 8
    :goto_0
    new-instance v0, Lcom/chartboost/sdk/privacy/model/GDPR;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/chartboost/sdk/privacy/model/GDPR;-><init>(Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;)V

    .line 11
    .line 12
    .line 13
    check-cast v0, Lcom/chartboost/sdk/privacy/model/DataUseConsent;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lcom/chartboost/sdk/Chartboost;->addDataUseConsent(Landroid/content/Context;Lcom/chartboost/sdk/privacy/model/DataUseConsent;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static i(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/chartboost/sdk/privacy/model/LGPD;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/chartboost/sdk/privacy/model/LGPD;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    check-cast v0, Lcom/chartboost/sdk/privacy/model/DataUseConsent;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/chartboost/sdk/Chartboost;->addDataUseConsent(Landroid/content/Context;Lcom/chartboost/sdk/privacy/model/DataUseConsent;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(ZLg13;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string v0, "com.chartboost.sdk.Chartboost"

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lut;->e:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lg13;->b:Lg13;

    .line 15
    .line 16
    if-ne p2, v1, :cond_0

    .line 17
    .line 18
    invoke-static {v0, p1}, Lut;->g(Landroid/content/Context;Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-static {v0, p1}, Lut;->h(Landroid/content/Context;Z)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Lut;->i(Landroid/content/Context;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :goto_0
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :goto_1
    invoke-virtual {p0, p1}, Ldg1;->f(Ljava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final c()Li03;
    .locals 0

    .line 1
    iget-object p0, p0, Lut;->d:Li03;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lut;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
