.class public final Lse2;
.super Ldg1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Li03;


# direct methods
.method public constructor <init>(Li03;)V
    .locals 1

    .line 1
    const-string v0, "Singular"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ldg1;-><init>(Ljava/lang/String;Li03;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lse2;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lse2;->d:Li03;

    .line 9
    .line 10
    return-void
.end method

.method public static g(Z)V
    .locals 0

    .line 1
    xor-int/lit8 p0, p0, 0x1

    .line 2
    .line 3
    invoke-static {p0}, Lcom/singular/sdk/Singular;->limitDataSharing(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(ZLg13;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string p2, "com.singular.sdk.Singular"

    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lse2;->g(Z)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcom/singular/sdk/Singular;->resumeAllTracking()V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/singular/sdk/Singular;->trackingOptIn()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-static {}, Lcom/singular/sdk/Singular;->stopAllTracking()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :goto_1
    invoke-virtual {p0, p1}, Ldg1;->f(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final c()Li03;
    .locals 0

    .line 1
    iget-object p0, p0, Lse2;->d:Li03;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lse2;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
