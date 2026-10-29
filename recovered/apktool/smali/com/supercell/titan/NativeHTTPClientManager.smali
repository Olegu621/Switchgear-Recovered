.class public Lcom/supercell/titan/NativeHTTPClientManager;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:Ljava/util/Vector;

.field public static d:I

.field public static final e:Lcom/supercell/titan/NativeHTTPClientManager;


# instance fields
.field public final a:Lqj1;

.field public final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Vector;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/supercell/titan/NativeHTTPClientManager;->c:Ljava/util/Vector;

    .line 7
    .line 8
    const/16 v0, 0x4d2

    .line 9
    .line 10
    sput v0, Lcom/supercell/titan/NativeHTTPClientManager;->d:I

    .line 11
    .line 12
    new-instance v0, Lcom/supercell/titan/NativeHTTPClientManager;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/supercell/titan/NativeHTTPClientManager;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/supercell/titan/NativeHTTPClientManager;->e:Lcom/supercell/titan/NativeHTTPClientManager;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqj1;

    .line 5
    .line 6
    invoke-direct {v0}, Lqj1;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPClientManager;->a:Lqj1;

    .line 10
    .line 11
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/supercell/titan/NativeHTTPClientManager;->b:Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    return-void
.end method

.method public static native getFinished(ZI[BI)V
.end method

.method public static getInstance()Lcom/supercell/titan/NativeHTTPClientManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/NativeHTTPClientManager;->e:Lcom/supercell/titan/NativeHTTPClientManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public static native postFinished(ZI[BI)V
.end method

.method public static startGetRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/NativeHTTPClientManager;->getInstance()Lcom/supercell/titan/NativeHTTPClientManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/supercell/titan/NativeHTTPConnection;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/supercell/titan/NativeHTTPClientManager;->a:Lqj1;

    .line 8
    .line 9
    invoke-direct {v1, v2, p2, p3}, Lcom/supercell/titan/NativeHTTPConnection;-><init>(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, p1}, Lcom/supercell/titan/NativeHTTPConnection;->prepareGet(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget p0, Lcom/supercell/titan/NativeHTTPClientManager;->d:I

    .line 16
    .line 17
    add-int/lit8 p1, p0, 0x1

    .line 18
    .line 19
    sput p1, Lcom/supercell/titan/NativeHTTPClientManager;->d:I

    .line 20
    .line 21
    iput p0, v1, Lcom/supercell/titan/NativeHTTPConnection;->tag:I

    .line 22
    .line 23
    iget-object p0, v0, Lcom/supercell/titan/NativeHTTPClientManager;->b:Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    iget p0, v1, Lcom/supercell/titan/NativeHTTPConnection;->tag:I

    .line 29
    .line 30
    return p0
.end method

.method public static startPostRequest(Ljava/lang/String;Ljava/lang/String;[B[Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .line 1
    invoke-static {}, Lcom/supercell/titan/NativeHTTPClientManager;->getInstance()Lcom/supercell/titan/NativeHTTPClientManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/supercell/titan/NativeHTTPConnection;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/supercell/titan/NativeHTTPClientManager;->a:Lqj1;

    .line 8
    .line 9
    const v3, 0x1a7

    const-string v3, ""

    .line 10
    .line 11
    invoke-direct {v1, v2, v3, v3}, Lcom/supercell/titan/NativeHTTPConnection;-><init>(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    if-eqz p4, :cond_1

    .line 17
    .line 18
    array-length v2, p3

    .line 19
    array-length v3, p4

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    array-length p3, p3

    .line 23
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    array-length p4, p4

    .line 28
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    filled-new-array {p3, p4}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const p4, 0x1a8

    const-string p4, "HeaderNames length=%d does not match HeaderValues length=%d."

    .line 37
    .line 38
    invoke-static {p4, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    const p4, 0x1a9

    const-string p4, "NativeHTTPClientManager"

    .line 43
    .line 44
    invoke-static {p4, p3}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_0
    array-length v4, p3

    .line 55
    if-ge v3, v4, :cond_2

    .line 56
    .line 57
    aget-object v4, p3, v3

    .line 58
    .line 59
    aget-object v5, p4, v3

    .line 60
    .line 61
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    :goto_1
    const/4 v2, 0x0

    .line 68
    :cond_2
    invoke-virtual {v1, p0, p2, p1, v2}, Lcom/supercell/titan/NativeHTTPConnection;->preparePost(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;)V

    .line 69
    .line 70
    .line 71
    sget p0, Lcom/supercell/titan/NativeHTTPClientManager;->d:I

    .line 72
    .line 73
    add-int/lit8 p1, p0, 0x1

    .line 74
    .line 75
    sput p1, Lcom/supercell/titan/NativeHTTPClientManager;->d:I

    .line 76
    .line 77
    iput p0, v1, Lcom/supercell/titan/NativeHTTPConnection;->tag:I

    .line 78
    .line 79
    iget-object p0, v0, Lcom/supercell/titan/NativeHTTPClientManager;->b:Ljava/util/concurrent/ExecutorService;

    .line 80
    .line 81
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    iget p0, v1, Lcom/supercell/titan/NativeHTTPConnection;->tag:I

    .line 85
    .line 86
    return p0
.end method


# virtual methods
.method public updateBeforeFrame()V
    .locals 9

    .line 1
    sget-object p0, Lcom/supercell/titan/NativeHTTPClientManager;->c:Ljava/util/Vector;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Lcom/supercell/titan/NativeHTTPConnection;

    .line 16
    .line 17
    invoke-virtual {v3}, Lcom/supercell/titan/NativeHTTPConnection;->getStatus()Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    sget-object v5, Lcom/supercell/titan/NativeHTTPConnection$Status;->OK:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 22
    .line 23
    if-ne v4, v5, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move v4, v1

    .line 28
    :goto_1
    if-nez v4, :cond_1

    .line 29
    .line 30
    const v5, 0x1aa

    const-string v5, "NativeHTTPClientManager"

    .line 31
    .line 32
    const v6, 0x1ab

    const-string v6, "http fail"

    .line 33
    .line 34
    invoke-static {v5, v6}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_1
    iget v5, v3, Lcom/supercell/titan/NativeHTTPConnection;->tag:I

    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/supercell/titan/NativeHTTPConnection;->getReceivedData()[B

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v3}, Lcom/supercell/titan/NativeHTTPConnection;->getMethod()Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    sget-object v8, Lcom/supercell/titan/NativeHTTPConnection$Method;->GET:Lcom/supercell/titan/NativeHTTPConnection$Method;

    .line 48
    .line 49
    if-ne v7, v8, :cond_2

    .line 50
    .line 51
    invoke-virtual {v3}, Lcom/supercell/titan/NativeHTTPConnection;->getResponseCode()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {v4, v5, v6, v3}, Lcom/supercell/titan/NativeHTTPClientManager;->getFinished(ZI[BI)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {v3}, Lcom/supercell/titan/NativeHTTPConnection;->getResponseCode()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v4, v5, v6, v3}, Lcom/supercell/titan/NativeHTTPClientManager;->postFinished(ZI[BI)V

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-void
.end method
