.class final Lcom/google/android/gms/internal/auth-api/zbat;
.super Lw8;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


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


# virtual methods
.method public final synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lxy;Lwp1;)Ld9;
    .locals 0

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    new-instance p0, Lcom/google/android/gms/internal/auth-api/zbaz;

    .line 4
    .line 5
    move-object p4, p3

    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/internal/auth-api/zbaz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lrc3;Lwv;Lxy;Lwp1;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
