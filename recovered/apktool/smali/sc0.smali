.class public final Lsc0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final j:Ljava/lang/Object;

.field public static volatile k:Lsc0;


# instance fields
.field public final a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final b:Lkd;

.field public volatile c:I

.field public final d:Landroid/os/Handler;

.field public final e:Lcj;

.field public final f:Lrc0;

.field public final g:Lzb0;

.field public final h:I

.field public final i:Ly50;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsc0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lml0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    iput v1, p0, Lsc0;->c:I

    .line 13
    .line 14
    iget-object v1, p1, Lpc0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lrc0;

    .line 17
    .line 18
    iput-object v1, p0, Lsc0;->f:Lrc0;

    .line 19
    .line 20
    iget v2, p1, Lpc0;->a:I

    .line 21
    .line 22
    iput v2, p0, Lsc0;->h:I

    .line 23
    .line 24
    iget-object p1, p1, Lpc0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ly50;

    .line 27
    .line 28
    iput-object p1, p0, Lsc0;->i:Ly50;

    .line 29
    .line 30
    new-instance p1, Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lsc0;->d:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance p1, Lkd;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {p1, v3}, Lkd;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lsc0;->b:Lkd;

    .line 48
    .line 49
    new-instance p1, Lzb0;

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    invoke-direct {p1, v4}, Lzb0;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lsc0;->g:Lzb0;

    .line 56
    .line 57
    new-instance p1, Lcj;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Lcj;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lsc0;->e:Lcj;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 69
    .line 70
    .line 71
    if-nez v2, :cond_0

    .line 72
    .line 73
    :try_start_0
    iput v3, p0, Lsc0;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lsc0;->b()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    :try_start_1
    new-instance v0, Loc0;

    .line 101
    .line 102
    invoke-direct {v0, p1}, Loc0;-><init>(Lcj;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v1, v0}, Lrc0;->a(Lk50;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :catchall_1
    move-exception p1

    .line 110
    invoke-virtual {p0, p1}, Lsc0;->d(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    return-void
.end method

.method public static a()Lsc0;
    .locals 4

    .line 1
    sget-object v0, Lsc0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lsc0;->k:Lsc0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    .line 12
    .line 13
    invoke-static {v3, v2}, Lde3;->j(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object v1

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget v0, p0, Lsc0;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, Lsc0;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const-string v3, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    .line 11
    .line 12
    invoke-static {v3, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lsc0;->b()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget v0, p0, Lsc0;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    :try_start_1
    iput v1, p0, Lsc0;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    iget-object v0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lsc0;->e:Lcj;

    .line 57
    .line 58
    iget-object v0, p0, Lcj;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lsc0;

    .line 61
    .line 62
    :try_start_2
    new-instance v1, Loc0;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Loc0;-><init>(Lcj;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, v0, Lsc0;->f:Lrc0;

    .line 68
    .line 69
    invoke-interface {p0, v1}, Lrc0;->a(Lk50;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    invoke-virtual {v0, p0}, Lsc0;->d(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 86
    .line 87
    .line 88
    throw v0
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    :try_start_0
    iput v1, p0, Lsc0;->c:I

    .line 17
    .line 18
    iget-object v1, p0, Lsc0;->b:Lkd;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lsc0;->b:Lkd;

    .line 24
    .line 25
    invoke-virtual {v1}, Lkd;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lsc0;->d:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v2, Lym;

    .line 40
    .line 41
    iget p0, p0, Lsc0;->c:I

    .line 42
    .line 43
    invoke-direct {v2, v0, p0, p1}, Lym;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public final e(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lsc0;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const-string v3, "Not initialized yet"

    .line 13
    .line 14
    invoke-static {v3, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    if-ltz p2, :cond_14

    .line 19
    .line 20
    if-ltz p3, :cond_13

    .line 21
    .line 22
    if-gt p2, p3, :cond_1

    .line 23
    .line 24
    move v3, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v3, v1

    .line 27
    :goto_1
    const-string v4, "start should be <= than end"

    .line 28
    .line 29
    invoke-static {v4, v3}, Lde3;->e(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-gt p2, v3, :cond_3

    .line 40
    .line 41
    move v3, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move v3, v1

    .line 44
    :goto_2
    const-string v4, "start should be < than charSequence length"

    .line 45
    .line 46
    invoke-static {v4, v3}, Lde3;->e(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-gt p3, v3, :cond_4

    .line 54
    .line 55
    move v3, v2

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move v3, v1

    .line 58
    :goto_3
    const-string v4, "end should be < than charSequence length"

    .line 59
    .line 60
    invoke-static {v4, v3}, Lde3;->e(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    if-ne p2, p3, :cond_6

    .line 70
    .line 71
    :cond_5
    move-object v4, p1

    .line 72
    goto/16 :goto_c

    .line 73
    .line 74
    :cond_6
    iget-object p0, p0, Lsc0;->e:Lcj;

    .line 75
    .line 76
    iget-object p0, p0, Lcj;->b:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v3, p0

    .line 79
    check-cast v3, Lec;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    instance-of p0, p1, Luf2;

    .line 85
    .line 86
    if-eqz p0, :cond_7

    .line 87
    .line 88
    move-object v4, p1

    .line 89
    check-cast v4, Luf2;

    .line 90
    .line 91
    invoke-virtual {v4}, Luf2;->a()V

    .line 92
    .line 93
    .line 94
    :cond_7
    const-class v4, Lrs2;

    .line 95
    .line 96
    if-nez p0, :cond_9

    .line 97
    .line 98
    :try_start_0
    instance-of v5, p1, Landroid/text/Spannable;

    .line 99
    .line 100
    if-eqz v5, :cond_8

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    instance-of v5, p1, Landroid/text/Spanned;

    .line 104
    .line 105
    if-eqz v5, :cond_a

    .line 106
    .line 107
    move-object v5, p1

    .line 108
    check-cast v5, Landroid/text/Spanned;

    .line 109
    .line 110
    add-int/lit8 v6, p2, -0x1

    .line 111
    .line 112
    add-int/lit8 v7, p3, 0x1

    .line 113
    .line 114
    invoke-interface {v5, v6, v7, v4}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-gt v5, p3, :cond_a

    .line 119
    .line 120
    new-instance v0, Lby2;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-boolean v1, v0, Lby2;->a:Z

    .line 126
    .line 127
    new-instance v5, Landroid/text/SpannableString;

    .line 128
    .line 129
    invoke-direct {v5, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    iput-object v5, v0, Lby2;->b:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :goto_4
    move-object v4, p1

    .line 136
    goto/16 :goto_b

    .line 137
    .line 138
    :catchall_0
    move-exception v0

    .line 139
    move-object p2, v0

    .line 140
    goto :goto_4

    .line 141
    :cond_9
    :goto_5
    :try_start_1
    new-instance v0, Lby2;

    .line 142
    .line 143
    move-object v5, p1

    .line 144
    check-cast v5, Landroid/text/Spannable;

    .line 145
    .line 146
    invoke-direct {v0, v5}, Lby2;-><init>(Landroid/text/Spannable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 147
    .line 148
    .line 149
    :cond_a
    :goto_6
    if-eqz v0, :cond_c

    .line 150
    .line 151
    :try_start_2
    iget-object v5, v0, Lby2;->b:Landroid/text/Spannable;

    .line 152
    .line 153
    invoke-interface {v5, p2, p3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    check-cast v4, [Lrs2;

    .line 158
    .line 159
    if-eqz v4, :cond_c

    .line 160
    .line 161
    array-length v5, v4

    .line 162
    if-lez v5, :cond_c

    .line 163
    .line 164
    array-length v5, v4

    .line 165
    :goto_7
    if-ge v1, v5, :cond_c

    .line 166
    .line 167
    aget-object v6, v4, v1

    .line 168
    .line 169
    iget-object v7, v0, Lby2;->b:Landroid/text/Spannable;

    .line 170
    .line 171
    invoke-interface {v7, v6}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    iget-object v8, v0, Lby2;->b:Landroid/text/Spannable;

    .line 176
    .line 177
    invoke-interface {v8, v6}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-eq v7, p3, :cond_b

    .line 182
    .line 183
    invoke-virtual {v0, v6}, Lby2;->removeSpan(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_b
    invoke-static {v7, p2}, Ljava/lang/Math;->min(II)I

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    invoke-static {v8, p3}, Ljava/lang/Math;->max(II)I

    .line 191
    .line 192
    .line 193
    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 194
    add-int/lit8 v1, v1, 0x1

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_c
    move v5, p2

    .line 198
    move v6, p3

    .line 199
    if-eq v5, v6, :cond_d

    .line 200
    .line 201
    :try_start_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-lt v5, p2, :cond_e

    .line 206
    .line 207
    :cond_d
    move-object v4, p1

    .line 208
    goto :goto_a

    .line 209
    :cond_e
    new-instance v9, Lwc0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 210
    .line 211
    :try_start_4
    iget-object p2, v3, Lec;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p2, Lzb0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 214
    .line 215
    :try_start_5
    invoke-direct {v9, v2, v0, p2}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 216
    .line 217
    .line 218
    const/4 v8, 0x0

    .line 219
    const v7, 0x7fffffff

    .line 220
    .line 221
    .line 222
    move-object v4, p1

    .line 223
    :try_start_6
    invoke-virtual/range {v3 .. v9}, Lec;->I(Ljava/lang/CharSequence;IIIZLdd0;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    check-cast p1, Lby2;

    .line 228
    .line 229
    if-eqz p1, :cond_10

    .line 230
    .line 231
    iget-object p1, p1, Lby2;->b:Landroid/text/Spannable;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 232
    .line 233
    if-eqz p0, :cond_f

    .line 234
    .line 235
    move-object p0, v4

    .line 236
    check-cast p0, Luf2;

    .line 237
    .line 238
    invoke-virtual {p0}, Luf2;->b()V

    .line 239
    .line 240
    .line 241
    :cond_f
    return-object p1

    .line 242
    :catchall_1
    move-exception v0

    .line 243
    :goto_8
    move-object p2, v0

    .line 244
    goto :goto_b

    .line 245
    :cond_10
    if-eqz p0, :cond_12

    .line 246
    .line 247
    :goto_9
    move-object p1, v4

    .line 248
    check-cast p1, Luf2;

    .line 249
    .line 250
    invoke-virtual {p1}, Luf2;->b()V

    .line 251
    .line 252
    .line 253
    return-object v4

    .line 254
    :catchall_2
    move-exception v0

    .line 255
    move-object v4, p1

    .line 256
    goto :goto_8

    .line 257
    :catchall_3
    move-exception v0

    .line 258
    move-object v4, p1

    .line 259
    move-object p1, v0

    .line 260
    move-object p2, p1

    .line 261
    goto :goto_b

    .line 262
    :goto_a
    if-eqz p0, :cond_12

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :goto_b
    if-eqz p0, :cond_11

    .line 266
    .line 267
    move-object p1, v4

    .line 268
    check-cast p1, Luf2;

    .line 269
    .line 270
    invoke-virtual {p1}, Luf2;->b()V

    .line 271
    .line 272
    .line 273
    :cond_11
    throw p2

    .line 274
    :cond_12
    :goto_c
    return-object v4

    .line 275
    :cond_13
    const-string p0, "end cannot be negative"

    .line 276
    .line 277
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-object v0

    .line 281
    :cond_14
    const-string p0, "start cannot be negative"

    .line 282
    .line 283
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    return-object v0
.end method

.method public final f(Lqc0;)V
    .locals 4

    .line 1
    const-string v0, "initCallback cannot be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget v0, p0, Lsc0;->c:I

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    iget v0, p0, Lsc0;->c:I

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lsc0;->b:Lkd;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lkd;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Lsc0;->d:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v1, Lym;

    .line 37
    .line 38
    iget v2, p0, Lsc0;->c:I

    .line 39
    .line 40
    filled-new-array {p1}, [Lqc0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v1, p1, v2, v3}, Lym;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_2
    iget-object p0, p0, Lsc0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 72
    .line 73
    .line 74
    throw p1
.end method
