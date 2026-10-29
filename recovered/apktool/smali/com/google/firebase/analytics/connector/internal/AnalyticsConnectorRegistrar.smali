.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$getComponents$0(Lcy;)Lcom/google/firebase/analytics/connector/AnalyticsConnector;
    .locals 3

    .line 1
    const-class v0, Lvi0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcy;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lvi0;

    .line 8
    .line 9
    const-class v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-interface {p0, v1}, Lcy;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/content/Context;

    .line 16
    .line 17
    const-class v2, Lli2;

    .line 18
    .line 19
    invoke-interface {p0, v2}, Lcy;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lli2;

    .line 24
    .line 25
    invoke-static {v0, v1, p0}, Lcom/google/firebase/analytics/connector/AnalyticsConnectorImpl;->getInstance(Lvi0;Landroid/content/Context;Lli2;)Lcom/google/firebase/analytics/connector/AnalyticsConnector;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static synthetic zza(Lcy;)Lcom/google/firebase/analytics/connector/AnalyticsConnector;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->lambda$getComponents$0(Lcy;)Lcom/google/firebase/analytics/connector/AnalyticsConnector;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsx;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lcom/google/firebase/analytics/connector/AnalyticsConnector;

    .line 2
    .line 3
    invoke-static {p0}, Lsx;->b(Ljava/lang/Class;)Lrx;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-class v0, Lvi0;

    .line 8
    .line 9
    invoke-static {v0}, Lr70;->a(Ljava/lang/Class;)Lr70;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lrx;->a(Lr70;)V

    .line 14
    .line 15
    .line 16
    const-class v0, Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v0}, Lr70;->a(Ljava/lang/Class;)Lr70;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0, v0}, Lrx;->a(Lr70;)V

    .line 23
    .line 24
    .line 25
    const-class v0, Lli2;

    .line 26
    .line 27
    invoke-static {v0}, Lr70;->a(Ljava/lang/Class;)Lr70;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lrx;->a(Lr70;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lcom/google/firebase/analytics/connector/internal/zzb;->zza:Lcom/google/firebase/analytics/connector/internal/zzb;

    .line 35
    .line 36
    const-string v1, "Null factory"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lxe2;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lrx;->f:Lfy;

    .line 42
    .line 43
    iget v0, p0, Lrx;->d:I

    .line 44
    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    :goto_0
    if-eqz v0, :cond_1

    .line 51
    .line 52
    const/4 v0, 0x2

    .line 53
    iput v0, p0, Lrx;->d:I

    .line 54
    .line 55
    invoke-virtual {p0}, Lrx;->b()Lsx;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v0, "fire-analytics"

    .line 60
    .line 61
    const-string v1, "22.5.0"

    .line 62
    .line 63
    invoke-static {v0, v1}, Li13;->i(Ljava/lang/String;Ljava/lang/String;)Lsx;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    filled-new-array {p0, v0}, [Lsx;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_1
    const-string p0, "Instantiation type has already been set."

    .line 77
    .line 78
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    return-object p0
.end method
