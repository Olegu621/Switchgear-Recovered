.class public final Lqx2;
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
    const-string v0, "Unity Ads"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ldg1;-><init>(Ljava/lang/String;Li03;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lqx2;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lqx2;->d:Li03;

    .line 9
    .line 10
    iput-object p2, p0, Lqx2;->e:Landroid/content/Context;

    .line 11
    .line 12
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
    const-string v0, "com.unity3d.ads.metadata.MetaData"

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/unity3d/ads/metadata/MetaData;

    .line 10
    .line 11
    iget-object v1, p0, Lqx2;->e:Landroid/content/Context;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lcom/unity3d/ads/metadata/MetaData;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lg13;->b:Lg13;

    .line 17
    .line 18
    if-ne p2, v1, :cond_0

    .line 19
    .line 20
    const-string p2, "privacy.consent"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string p2, "gdpr.consent"

    .line 26
    .line 27
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p2, p1}, Lcom/unity3d/ads/metadata/MetaData;->set(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/unity3d/ads/metadata/MetaData;->commit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :goto_1
    invoke-virtual {p0, p1}, Ldg1;->f(Ljava/lang/Exception;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final c()Li03;
    .locals 0

    .line 1
    iget-object p0, p0, Lqx2;->d:Li03;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lqx2;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
