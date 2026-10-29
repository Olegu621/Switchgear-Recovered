.class public final Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;",
        "callback",
        "<init>",
        "(Landroid/content/Context;Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V",
        "",
        "isPlayStoreInstalled",
        "(Landroid/content/Context;)Z",
        "",
        "queryBillingConfig",
        "(Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V",
        "disconnect",
        "()V",
        "Landroid/content/Context;",
        "Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;",
        "Ldj;",
        "billingClient",
        "Ldj;",
        "Companion",
        "scid_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$Companion;

.field private static final GOOGLE_PLAY_STORE_PACKAGE:Ljava/lang/String; = "com.android.vending"


# instance fields
.field private billingClient:Ldj;

.field private final callback:Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;

.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->Companion:Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->context:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->callback:Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->isPlayStoreInstalled(Landroid/content/Context;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    :try_start_0
    new-instance p2, Lcj;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Lcj;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Lec0;

    .line 26
    .line 27
    const/16 v0, 0x17

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lec0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p2, Lcj;->b:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance p1, Lds0;

    .line 35
    .line 36
    const/16 v0, 0x14

    .line 37
    .line 38
    invoke-direct {p1, v0}, Lds0;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p2, Lcj;->c:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p2}, Lcj;->a()Lej;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->billingClient:Ldj;

    .line 48
    .line 49
    new-instance p2, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$2;

    .line 50
    .line 51
    invoke-direct {p2, p0}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$2;-><init>(Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lej;->g(Lfj;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catch_0
    move-exception p1

    .line 59
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->callback:Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;

    .line 60
    .line 61
    new-instance p2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v0, "ScidPlugin: Failed to get app store country "

    .line 64
    .line 65
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p0, p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;->onError(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_0
    const-string p0, "ScidPlugin: Can\'t retrieve AppStore country as Google play store is not installed"

    .line 80
    .line 81
    invoke-interface {p2, p0}, Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;->onError(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private static final _init_$lambda$0(Lkj;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lkj;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->_init_$lambda$0(Lkj;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCallback$p(Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;)Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->callback:Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$queryBillingConfig(Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->queryBillingConfig(Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;Lkj;Lgj;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->queryBillingConfig$lambda$1(Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;Lkj;Lgj;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final isPlayStoreInstalled(Landroid/content/Context;)Z
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const-string v0, "com.android.vending"

    .line 7
    .line 8
    invoke-virtual {p1, v0, p0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-boolean p0, p1, Landroid/content/pm/ApplicationInfo;->enabled:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    :catch_0
    :cond_0
    return p0
.end method

.method private final queryBillingConfig(Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->billingClient:Ldj;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance v1, Lpn;

    .line 6
    .line 7
    const/16 v2, 0x9

    .line 8
    .line 9
    invoke-direct {v1, v2, p1, p0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lej;

    .line 13
    .line 14
    invoke-virtual {v0}, Lej;->c()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const-string p1, "BillingClient"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/16 v3, 0xd

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const-string p0, "Service disconnected."

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkf3;->j:Lkj;

    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    invoke-virtual {v0, p1, v3, p0}, Lej;->x(IILkj;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p0, v2}, Lpn;->g(Lkj;Lgj;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-boolean p0, v0, Lej;->s:Z

    .line 41
    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    const-string p0, "Current client doesn\'t support get billing config."

    .line 45
    .line 46
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkf3;->p:Lkj;

    .line 50
    .line 51
    const/16 p1, 0x20

    .line 52
    .line 53
    invoke-virtual {v0, p1, v3, p0}, Lej;->x(IILkj;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p0, v2}, Lpn;->g(Lkj;Lgj;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    new-instance v4, Lyd3;

    .line 61
    .line 62
    const/4 p0, 0x4

    .line 63
    invoke-direct {v4, p0, v0, v1}, Lyd3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v7, Lol3;

    .line 67
    .line 68
    const/4 p0, 0x6

    .line 69
    const/4 p1, 0x0

    .line 70
    invoke-direct {v7, v0, v1, p0, p1}, Lol3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lej;->u()Landroid/os/Handler;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v0}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    const-wide/16 v5, 0x7530

    .line 82
    .line 83
    invoke-static/range {v4 .. v9}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-nez p0, :cond_2

    .line 88
    .line 89
    invoke-virtual {v0}, Lej;->i()Lkj;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const/16 p1, 0x19

    .line 94
    .line 95
    invoke-virtual {v0, p1, v3, p0}, Lej;->x(IILkj;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, p0, v2}, Lpn;->g(Lkj;Lgj;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void
.end method

.method private static final queryBillingConfig$lambda$1(Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;Lkj;Lgj;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p2, Lkj;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    iget-object p2, p3, Lgj;->a:Ljava/lang/String;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    :goto_0
    invoke-interface {p0, p2}, Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;->onCountryRetrieved(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->disconnect()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object p1, p2, Lkj;->b:Ljava/lang/String;

    .line 22
    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p3, "Failed to retrieve billing config: "

    .line 26
    .line 27
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p0, p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;->onError(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final disconnect()V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lo42;->b:Lm42;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->billingClient:Ldj;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ldj;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    sget-object v0, Lo42;->b:Lm42;

    .line 12
    .line 13
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->billingClient:Ldj;

    .line 15
    .line 16
    return-void
.end method
