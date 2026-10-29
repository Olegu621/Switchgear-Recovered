.class public final Lxz0;
.super Ldg1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Li03;


# direct methods
.method public constructor <init>(Li03;)V
    .locals 1

    .line 1
    const-string v0, "Iron Source"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ldg1;-><init>(Ljava/lang/String;Li03;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lxz0;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lxz0;->d:Li03;

    .line 9
    .line 10
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
    const-string v0, "com.ironsource.mediationsdk.IronSource"

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lg13;->b:Lg13;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    const-string p2, "do_not_sell"

    .line 15
    .line 16
    xor-int/2addr p1, v1

    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p2, p1}, Lcom/ironsource/mediationsdk/IronSource;->setMetaData(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-static {p1}, Lcom/ironsource/mediationsdk/IronSource;->setConsent(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :goto_0
    return v1

    .line 31
    :goto_1
    invoke-virtual {p0, p1}, Ldg1;->f(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public final c()Li03;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz0;->d:Li03;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
