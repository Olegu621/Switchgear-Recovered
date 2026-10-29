.class public final Lrs0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static y:Lrs0;

.field public static final z:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Liy;

.field public f:Lnm;

.field public g:Lec0;

.field public h:Lb5;

.field public i:Lra2;

.field public j:Lxy1;

.field public k:Lnm;

.field public l:Lnm;

.field public m:Lwc0;

.field public final n:Ler0;

.field public o:Lts0;

.field public final p:Lra2;

.field public q:Lwc0;

.field public r:Lcb;

.field public s:Lcb;

.field public t:Lec;

.field public u:Lb5;

.field public v:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final w:Lll1;

.field public final x:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lrs0;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrs0;->x:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Ler0;

    .line 7
    .line 8
    new-instance v1, Ler0;

    .line 9
    .line 10
    const-string v2, "__hs_lite_sdk_store"

    .line 11
    .line 12
    invoke-direct {v1, p1, v2}, Ler0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v2}, Ler0;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Ler0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object v0, p0, Lrs0;->n:Ler0;

    .line 22
    .line 23
    new-instance v1, Lfs0;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-direct {v1, v3, v2}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lfs0;

    .line 34
    .line 35
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-direct {v3, v4, v2}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Lzb0;

    .line 43
    .line 44
    const/16 v4, 0xd

    .line 45
    .line 46
    invoke-direct {v2, v4}, Lzb0;-><init>(I)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lra2;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v5, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v5, v4, Lra2;->d:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v1, v4, Lra2;->a:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v3, v4, Lra2;->b:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v2, v4, Lra2;->c:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v4, p0, Lrs0;->p:Lra2;

    .line 68
    .line 69
    new-instance v1, Lll1;

    .line 70
    .line 71
    invoke-direct {v1, p1, v0}, Lll1;-><init>(Landroid/content/Context;Ler0;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lrs0;->w:Lll1;

    .line 75
    .line 76
    return-void
.end method

.method public static b()Z
    .locals 1

    .line 1
    sget-object v0, Lrs0;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method


# virtual methods
.method public final a()Lnm;
    .locals 9

    .line 1
    iget-object v0, p0, Lrs0;->k:Lnm;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v2, Ler0;

    .line 6
    .line 7
    const-string v0, "__hs_chat_resource_cache"

    .line 8
    .line 9
    iget-object v1, p0, Lrs0;->x:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v2, v1, v0}, Ler0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v4, Lxt0;

    .line 15
    .line 16
    const/16 v0, 0x19

    .line 17
    .line 18
    invoke-direct {v4, v0}, Lxt0;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lzb0;

    .line 22
    .line 23
    new-instance v0, Lp62;

    .line 24
    .line 25
    const/4 v5, 0x7

    .line 26
    invoke-direct {v0, v5}, Lp62;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v5, 0xc

    .line 30
    .line 31
    invoke-direct {v3, v0, v5}, Lzb0;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    move-object v0, v1

    .line 35
    new-instance v1, Lnm;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const-string v6, "https://webchat.helpshift.com/latest/android/android-mapping.json"

    .line 46
    .line 47
    const-string v7, "chat_cacheURLs"

    .line 48
    .line 49
    const-string v8, "webchat"

    .line 50
    .line 51
    invoke-direct/range {v1 .. v8}, Lnm;-><init>(Ler0;Lzb0;Lv32;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lrs0;->k:Lnm;

    .line 55
    .line 56
    :cond_0
    iget-object p0, p0, Lrs0;->k:Lnm;

    .line 57
    .line 58
    return-object p0
.end method
