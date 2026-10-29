.class public final synthetic Lji1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Lji1;->a:I

    iput-object p2, p0, Lji1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lji1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/k1;Lio/sentry/k1;)V
    .locals 0

    .line 1
    const/16 p1, 0x13

    .line 2
    .line 3
    iput p1, p0, Lji1;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lji1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lji1;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method private final a()V
    .locals 9

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le53;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, [Landroid/view/View;

    .line 8
    .line 9
    iget v1, v0, Le53;->p:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, -0x1

    .line 13
    if-eq v1, v3, :cond_0

    .line 14
    .line 15
    array-length v1, p0

    .line 16
    move v4, v2

    .line 17
    :goto_0
    if-ge v4, v1, :cond_0

    .line 18
    .line 19
    aget-object v5, p0, v4

    .line 20
    .line 21
    iget v6, v0, Le53;->p:I

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-virtual {v5, v6, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget v1, v0, Le53;->q:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_1

    .line 40
    .line 41
    array-length v1, p0

    .line 42
    :goto_1
    if-ge v2, v1, :cond_1

    .line 43
    .line 44
    aget-object v3, p0, v2

    .line 45
    .line 46
    iget v4, v0, Le53;->q:I

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {v3, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    return-void
.end method

.method private final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/AnrIntegration;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 8
    .line 9
    iget-object v1, v0, Lio/sentry/android/core/AnrIntegration;->c:Lio/sentry/util/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-boolean v2, v0, Lio/sentry/android/core/AnrIntegration;->b:Z

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lio/sentry/android/core/AnrIntegration;->c(Lio/sentry/android/core/SentryAndroidOptions;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :catchall_1
    move-exception v0

    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_2
    throw p0
.end method

.method private final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/FeedbackShakeIntegration;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/app/Activity;

    .line 8
    .line 9
    iget-boolean v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->e:Z

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x1

    .line 27
    :try_start_0
    iput-boolean v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->e:Z

    .line 28
    .line 29
    iget-object v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 30
    .line 31
    invoke-virtual {v1}, Lio/sentry/m6;->getFeedbackOptions()Lio/sentry/h5;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v1, v1, Lio/sentry/h5;->h:Ljava/lang/Runnable;

    .line 36
    .line 37
    iput-object v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->f:Ljava/lang/Runnable;

    .line 38
    .line 39
    iget-object v2, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 40
    .line 41
    invoke-virtual {v2}, Lio/sentry/m6;->getFeedbackOptions()Lio/sentry/h5;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, Lji1;

    .line 46
    .line 47
    const/16 v4, 0x17

    .line 48
    .line 49
    invoke-direct {v3, v4, v0, v1}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object v3, v2, Lio/sentry/h5;->h:Ljava/lang/Runnable;

    .line 53
    .line 54
    new-instance v1, Lio/sentry/android/core/s1;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lio/sentry/android/core/s1;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lio/sentry/android/core/s1;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    const/4 v1, 0x0

    .line 65
    iput-boolean v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->e:Z

    .line 66
    .line 67
    iget-object v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 68
    .line 69
    invoke-virtual {v1}, Lio/sentry/m6;->getFeedbackOptions()Lio/sentry/h5;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v2, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->f:Ljava/lang/Runnable;

    .line 74
    .line 75
    iput-object v2, v1, Lio/sentry/h5;->h:Ljava/lang/Runnable;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    iput-object v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->f:Ljava/lang/Runnable;

    .line 79
    .line 80
    iget-object v0, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 81
    .line 82
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 87
    .line 88
    const-string v2, "Failed to show feedback dialog on shake."

    .line 89
    .line 90
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    :goto_0
    return-void
.end method

.method private final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/FeedbackShakeIntegration;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Runnable;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->e:Z

    .line 11
    .line 12
    iget-object v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    invoke-virtual {v1}, Lio/sentry/m6;->getFeedbackOptions()Lio/sentry/h5;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object p0, v1, Lio/sentry/h5;->h:Ljava/lang/Runnable;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    iput-object p0, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->f:Ljava/lang/Runnable;

    .line 27
    .line 28
    return-void
.end method

.method private final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/s1;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lio/sentry/android/core/s1;->show()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lio/sentry/android/core/anr/d;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/anr/d;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    iget-object p0, v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;->w:Lio/sentry/ILogger;

    .line 17
    .line 18
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    new-array v1, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    const-string v2, "Failed to close AnrProfileManager"

    .line 24
    .line 25
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/internal/util/r;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lio/sentry/ILogger;

    .line 8
    .line 9
    :try_start_0
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lio/sentry/android/core/internal/util/r;->V:Landroid/view/Choreographer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 18
    .line 19
    const-string v2, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported."

    .line 20
    .line 21
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/ndk/b;

    .line 4
    .line 5
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lio/sentry/ndk/NativeScope;->nativeAddAttachment(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final i()V
    .locals 10

    .line 1
    iget-object v0, p0, Lji1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lio/sentry/android/ndk/b;

    .line 5
    .line 6
    iget-object p0, p0, Lji1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lio/sentry/f;

    .line 9
    .line 10
    iget-object v2, v1, Lio/sentry/android/ndk/b;->a:Lio/sentry/m6;

    .line 11
    .line 12
    iget-object v0, p0, Lio/sentry/f;->w:Lio/sentry/m5;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v4, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v4, v3

    .line 30
    :goto_0
    invoke-virtual {p0}, Lio/sentry/f;->c()Ljava/util/Date;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    invoke-static {v5, v6}, Lio/sentry/config/a;->q(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-interface {v5, v0}, Lio/sentry/i1;->d(Ljava/util/Map;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    :goto_1
    move-object v9, v3

    .line 64
    goto :goto_3

    .line 65
    :goto_2
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    new-array v6, v6, [Ljava/lang/Object;

    .line 73
    .line 74
    const-string v7, "Breadcrumb data is not serializable."

    .line 75
    .line 76
    invoke-interface {v2, v5, v0, v7, v6}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :goto_3
    iget-object v0, v1, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    .line 81
    .line 82
    iget-object v5, p0, Lio/sentry/f;->d:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v6, p0, Lio/sentry/f;->i:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v7, p0, Lio/sentry/f;->e:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static/range {v4 .. v9}, Lio/sentry/ndk/NativeScope;->nativeAddBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lji1;->a:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lio/sentry/android/ndk/b;

    .line 14
    .line 15
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/sentry/b7;

    .line 18
    .line 19
    iget-object v1, v1, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    .line 20
    .line 21
    iget-object v2, v0, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 22
    .line 23
    invoke-virtual {v2}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v0, v0, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 28
    .line 29
    invoke-virtual {v0}, Lio/sentry/d7;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v0}, Lio/sentry/ndk/NativeScope;->nativeSetTrace(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    invoke-direct {v0}, Lji1;->i()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    invoke-direct {v0}, Lji1;->h()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2
    invoke-direct {v0}, Lji1;->g()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_3
    invoke-direct {v0}, Lji1;->f()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_4
    invoke-direct {v0}, Lji1;->e()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_5
    invoke-direct {v0}, Lji1;->d()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_6
    invoke-direct {v0}, Lji1;->c()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_7
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lio/sentry/android/core/g0;

    .line 71
    .line 72
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lio/sentry/ILogger;

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Lio/sentry/android/core/g0;->f(Lio/sentry/ILogger;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_8
    invoke-direct {v0}, Lji1;->b()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_9
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lio/sentry/k1;

    .line 87
    .line 88
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lio/sentry/k1;

    .line 91
    .line 92
    invoke-static {v1, v0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->f(Lio/sentry/k1;Lio/sentry/k1;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_a
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Lio/sentry/g4;

    .line 99
    .line 100
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lio/sentry/g1;

    .line 103
    .line 104
    invoke-virtual {v1}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Lio/sentry/m6;->getShutdownTimeoutMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v1

    .line 112
    invoke-interface {v0, v1, v2}, Lio/sentry/g1;->a(J)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_b
    invoke-direct {v0}, Lji1;->a()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_c
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Landroid/content/Context;

    .line 123
    .line 124
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 127
    .line 128
    invoke-static {v1, v0}, Lcom/supercell/titan/usercentrics/UsercentricsInitializer;->a(Landroid/content/Context;Lcom/usercentrics/sdk/UsercentricsOptions;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_d
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Lh22;

    .line 135
    .line 136
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 137
    .line 138
    move-object v6, v0

    .line 139
    check-cast v6, Luq2;

    .line 140
    .line 141
    iget-object v0, v1, Lh22;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Ljava/lang/Iterable;

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_3d

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Lkotlin/Pair;

    .line 160
    .line 161
    iget-object v7, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v7, Lk;

    .line 164
    .line 165
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v8, v0

    .line 168
    check-cast v8, Lyq2;

    .line 169
    .line 170
    new-instance v9, Lzq2;

    .line 171
    .line 172
    invoke-direct {v9}, Lzq2;-><init>()V

    .line 173
    .line 174
    .line 175
    iget-object v0, v8, Lyq2;->a:Ljava/lang/String;

    .line 176
    .line 177
    if-eqz v0, :cond_0

    .line 178
    .line 179
    const-string v10, "iglu:com.snowplowanalytics.mobile/application_install/jsonschema/1-0-0"

    .line 180
    .line 181
    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    :cond_0
    const-string v0, "e"

    .line 186
    .line 187
    const-string v10, "eid"

    .line 188
    .line 189
    iget-object v11, v8, Lyq2;->f:Ljava/util/UUID;

    .line 190
    .line 191
    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v9, v10, v11}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const-string v10, "dtm"

    .line 199
    .line 200
    iget-wide v11, v8, Lyq2;->g:J

    .line 201
    .line 202
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    invoke-virtual {v9, v10, v11}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const-string v10, "aid"

    .line 210
    .line 211
    iget-object v11, v6, Luq2;->b:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v9, v10, v11}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string v10, "tna"

    .line 217
    .line 218
    iget-object v11, v6, Luq2;->a:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v9, v10, v11}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const-string v10, "tv"

    .line 224
    .line 225
    iget-object v11, v6, Luq2;->f:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v9, v10, v11}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v10, v6, Luq2;->j:Ld31;

    .line 231
    .line 232
    if-eqz v10, :cond_2

    .line 233
    .line 234
    new-instance v11, Ljava/util/HashMap;

    .line 235
    .line 236
    iget-boolean v12, v6, Luq2;->u:Z

    .line 237
    .line 238
    iget-object v10, v10, Ld31;->a:Ljava/util/HashMap;

    .line 239
    .line 240
    if-eqz v12, :cond_1

    .line 241
    .line 242
    new-instance v12, Ljava/util/HashMap;

    .line 243
    .line 244
    invoke-direct {v12, v10}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 245
    .line 246
    .line 247
    const-string v10, "uid"

    .line 248
    .line 249
    invoke-virtual {v12, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    const-string v10, "duid"

    .line 253
    .line 254
    invoke-virtual {v12, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    const-string v10, "tnuid"

    .line 258
    .line 259
    invoke-virtual {v12, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    const-string v10, "ip"

    .line 263
    .line 264
    invoke-virtual {v12, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-object v10, v12

    .line 268
    :cond_1
    invoke-direct {v11, v10}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v9, v11}, Lzq2;->c(Ljava/util/Map;)V

    .line 272
    .line 273
    .line 274
    :cond_2
    const-string v10, "p"

    .line 275
    .line 276
    iget v11, v6, Luq2;->H:I

    .line 277
    .line 278
    invoke-static {v11}, Len;->f(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    invoke-virtual {v9, v10, v11}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-boolean v10, v8, Lyq2;->h:Z

    .line 286
    .line 287
    if-eqz v10, :cond_3

    .line 288
    .line 289
    iget-object v10, v8, Lyq2;->b:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v9, v0, v10}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_3
    const-string v10, "ue"

    .line 296
    .line 297
    invoke-virtual {v9, v0, v10}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :goto_1
    iget-object v10, v6, Luq2;->e:Lf31;

    .line 301
    .line 302
    monitor-enter v10

    .line 303
    :try_start_0
    new-instance v0, Ljava/util/LinkedList;

    .line 304
    .line 305
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 306
    .line 307
    .line 308
    iget-object v11, v10, Lf31;->e:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v11, Ljava/util/HashMap;

    .line 311
    .line 312
    iget-object v12, v8, Lyq2;->a:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    check-cast v11, Ljava/util/List;

    .line 319
    .line 320
    if-eqz v11, :cond_4

    .line 321
    .line 322
    invoke-virtual {v0, v11}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_2

    .line 326
    :catchall_0
    move-exception v0

    .line 327
    goto/16 :goto_28

    .line 328
    .line 329
    :cond_4
    :goto_2
    iget-object v11, v10, Lf31;->e:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v11, Ljava/util/HashMap;

    .line 332
    .line 333
    const-string v12, "*"

    .line 334
    .line 335
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    check-cast v11, Ljava/util/List;

    .line 340
    .line 341
    if-eqz v11, :cond_5

    .line 342
    .line 343
    invoke-virtual {v0, v11}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 344
    .line 345
    .line 346
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v11

    .line 354
    if-eqz v11, :cond_9

    .line 355
    .line 356
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v11

    .line 360
    check-cast v11, Lq50;

    .line 361
    .line 362
    iget-object v12, v10, Lf31;->b:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v12, Ljava/util/HashMap;

    .line 365
    .line 366
    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    check-cast v12, Ljava/lang/String;

    .line 371
    .line 372
    if-eqz v12, :cond_6

    .line 373
    .line 374
    iget-object v13, v8, Lyq2;->d:Lfs0;

    .line 375
    .line 376
    if-eqz v13, :cond_8

    .line 377
    .line 378
    invoke-virtual {v13, v12}, Lfs0;->r(Ljava/lang/String;)Lng2;

    .line 379
    .line 380
    .line 381
    move-result-object v12

    .line 382
    invoke-virtual {v11, v8, v12}, Lq50;->i(Lyq2;Lng2;)Ljava/util/Map;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    if-eqz v11, :cond_6

    .line 387
    .line 388
    check-cast v11, Ljava/util/HashMap;

    .line 389
    .line 390
    invoke-virtual {v11}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    :cond_7
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-eqz v12, :cond_6

    .line 403
    .line 404
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    check-cast v12, Ljava/util/Map$Entry;

    .line 409
    .line 410
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    check-cast v13, Ljava/lang/String;

    .line 415
    .line 416
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v12

    .line 420
    invoke-virtual {v8}, Lyq2;->b()Ljava/util/Map;

    .line 421
    .line 422
    .line 423
    move-result-object v14

    .line 424
    check-cast v14, Ljava/util/HashMap;

    .line 425
    .line 426
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v14

    .line 430
    if-nez v14, :cond_7

    .line 431
    .line 432
    invoke-virtual {v8}, Lyq2;->b()Ljava/util/Map;

    .line 433
    .line 434
    .line 435
    move-result-object v14

    .line 436
    check-cast v14, Ljava/util/HashMap;

    .line 437
    .line 438
    invoke-virtual {v14, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    goto :goto_3

    .line 442
    :cond_8
    const-string v0, "state"

    .line 443
    .line 444
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 448
    :cond_9
    monitor-exit v10

    .line 449
    iget-boolean v0, v6, Luq2;->A:Z

    .line 450
    .line 451
    if-eqz v0, :cond_c

    .line 452
    .line 453
    iget-object v0, v6, Luq2;->d:Landroid/content/Context;

    .line 454
    .line 455
    sget v10, Lmn0;->p:I

    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-virtual {v10, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 473
    .line 474
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 475
    .line 476
    const/16 v12, 0x1c

    .line 477
    .line 478
    if-lt v11, v12, :cond_a

    .line 479
    .line 480
    invoke-static {v0}, Lrt1;->b(Landroid/content/pm/PackageInfo;)J

    .line 481
    .line 482
    .line 483
    move-result-wide v11

    .line 484
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    goto :goto_4

    .line 489
    :catch_0
    move-exception v0

    .line 490
    goto :goto_5

    .line 491
    :cond_a
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 492
    .line 493
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    :goto_4
    if-eqz v10, :cond_b

    .line 498
    .line 499
    new-instance v11, Ljava/util/HashMap;

    .line 500
    .line 501
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 502
    .line 503
    .line 504
    const-string v12, "version"

    .line 505
    .line 506
    invoke-static {v11, v12, v10}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    const-string v10, "build"

    .line 510
    .line 511
    invoke-static {v11, v10, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    new-instance v0, Lb92;

    .line 515
    .line 516
    const-string v10, "iglu:com.snowplowanalytics.mobile/application/jsonschema/1-0-0"

    .line 517
    .line 518
    invoke-direct {v0, v10, v11}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 519
    .line 520
    .line 521
    goto :goto_6

    .line 522
    :goto_5
    const-string v10, "mn0"

    .line 523
    .line 524
    const-string v11, "Failed to find application context: %s"

    .line 525
    .line 526
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-static {v10, v11, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    :cond_b
    move-object v0, v5

    .line 538
    :goto_6
    if-eqz v0, :cond_c

    .line 539
    .line 540
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v10

    .line 544
    check-cast v10, Ljava/util/ArrayList;

    .line 545
    .line 546
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    :cond_c
    iget-boolean v0, v6, Luq2;->z:Z

    .line 550
    .line 551
    if-eqz v0, :cond_13

    .line 552
    .line 553
    iget-object v10, v6, Luq2;->h:Lgs1;

    .line 554
    .line 555
    iget-boolean v0, v6, Luq2;->u:Z

    .line 556
    .line 557
    monitor-enter v10

    .line 558
    :try_start_2
    iget-boolean v11, v10, Lgs1;->h:Z

    .line 559
    .line 560
    if-nez v11, :cond_d

    .line 561
    .line 562
    invoke-virtual {v10}, Lgs1;->d()V

    .line 563
    .line 564
    .line 565
    goto :goto_7

    .line 566
    :catchall_1
    move-exception v0

    .line 567
    goto/16 :goto_a

    .line 568
    .line 569
    :cond_d
    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 570
    .line 571
    .line 572
    move-result-wide v11

    .line 573
    iget-wide v13, v10, Lgs1;->i:J

    .line 574
    .line 575
    sub-long v13, v11, v13

    .line 576
    .line 577
    iget-wide v3, v10, Lgs1;->a:J

    .line 578
    .line 579
    cmp-long v3, v13, v3

    .line 580
    .line 581
    if-ltz v3, :cond_e

    .line 582
    .line 583
    invoke-virtual {v10}, Lgs1;->c()V

    .line 584
    .line 585
    .line 586
    :cond_e
    iget-wide v3, v10, Lgs1;->j:J

    .line 587
    .line 588
    sub-long/2addr v11, v3

    .line 589
    iget-wide v3, v10, Lgs1;->b:J

    .line 590
    .line 591
    cmp-long v3, v11, v3

    .line 592
    .line 593
    if-ltz v3, :cond_f

    .line 594
    .line 595
    invoke-virtual {v10}, Lgs1;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 596
    .line 597
    .line 598
    :cond_f
    monitor-exit v10

    .line 599
    iget-object v3, v10, Lgs1;->g:Ljava/util/HashMap;

    .line 600
    .line 601
    const-string v4, "osType"

    .line 602
    .line 603
    const-string v11, "osVersion"

    .line 604
    .line 605
    const-string v12, "deviceManufacturer"

    .line 606
    .line 607
    const-string v13, "deviceModel"

    .line 608
    .line 609
    filled-new-array {v4, v11, v12, v13}, [Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    sget v11, Lmn0;->p:I

    .line 614
    .line 615
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    const/4 v11, 0x0

    .line 619
    :goto_8
    if-ge v11, v2, :cond_11

    .line 620
    .line 621
    aget-object v12, v4, v11

    .line 622
    .line 623
    invoke-virtual {v3, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v12

    .line 627
    if-nez v12, :cond_10

    .line 628
    .line 629
    move-object v3, v5

    .line 630
    goto :goto_9

    .line 631
    :cond_10
    add-int/lit8 v11, v11, 0x1

    .line 632
    .line 633
    goto :goto_8

    .line 634
    :cond_11
    if-eqz v0, :cond_12

    .line 635
    .line 636
    iget-object v0, v10, Lgs1;->g:Ljava/util/HashMap;

    .line 637
    .line 638
    const-string v3, "androidIdfa"

    .line 639
    .line 640
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-eqz v0, :cond_12

    .line 645
    .line 646
    new-instance v0, Ljava/util/HashMap;

    .line 647
    .line 648
    iget-object v3, v10, Lgs1;->g:Ljava/util/HashMap;

    .line 649
    .line 650
    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 651
    .line 652
    .line 653
    const-string v3, "androidIdfa"

    .line 654
    .line 655
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    new-instance v3, Lb92;

    .line 659
    .line 660
    const-string v4, "iglu:com.snowplowanalytics.snowplow/mobile_context/jsonschema/1-0-3"

    .line 661
    .line 662
    invoke-direct {v3, v4, v0}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    goto :goto_9

    .line 666
    :cond_12
    new-instance v3, Lb92;

    .line 667
    .line 668
    const-string v0, "iglu:com.snowplowanalytics.snowplow/mobile_context/jsonschema/1-0-3"

    .line 669
    .line 670
    iget-object v4, v10, Lgs1;->g:Ljava/util/HashMap;

    .line 671
    .line 672
    invoke-direct {v3, v0, v4}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    :goto_9
    if-eqz v3, :cond_13

    .line 676
    .line 677
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    check-cast v0, Ljava/util/ArrayList;

    .line 682
    .line 683
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    goto :goto_b

    .line 687
    :goto_a
    :try_start_3
    monitor-exit v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 688
    throw v0

    .line 689
    :cond_13
    :goto_b
    iget-boolean v0, v8, Lyq2;->i:Z

    .line 690
    .line 691
    if-eqz v0, :cond_14

    .line 692
    .line 693
    goto/16 :goto_16

    .line 694
    .line 695
    :cond_14
    iget-boolean v0, v6, Luq2;->y:Z

    .line 696
    .line 697
    if-eqz v0, :cond_1f

    .line 698
    .line 699
    iget-object v0, v6, Luq2;->d:Landroid/content/Context;

    .line 700
    .line 701
    sget v3, Lmn0;->p:I

    .line 702
    .line 703
    const-string v3, "longitude"

    .line 704
    .line 705
    const-string v4, "latitude"

    .line 706
    .line 707
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    const-string v10, "network"

    .line 711
    .line 712
    const-string v11, "gps"

    .line 713
    .line 714
    const-string v12, "location"

    .line 715
    .line 716
    invoke-virtual {v0, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    instance-of v12, v0, Landroid/location/LocationManager;

    .line 721
    .line 722
    if-eqz v12, :cond_15

    .line 723
    .line 724
    check-cast v0, Landroid/location/LocationManager;

    .line 725
    .line 726
    goto :goto_c

    .line 727
    :cond_15
    move-object v0, v5

    .line 728
    :goto_c
    if-eqz v0, :cond_16

    .line 729
    .line 730
    :try_start_4
    invoke-virtual {v0, v11}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 731
    .line 732
    .line 733
    move-result v12
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1

    .line 734
    const/4 v13, 0x1

    .line 735
    if-ne v12, v13, :cond_17

    .line 736
    .line 737
    move-object v10, v11

    .line 738
    goto :goto_e

    .line 739
    :catch_1
    move-exception v0

    .line 740
    const/4 v13, 0x1

    .line 741
    goto :goto_10

    .line 742
    :cond_16
    const/4 v13, 0x1

    .line 743
    :cond_17
    if-eqz v0, :cond_18

    .line 744
    .line 745
    :try_start_5
    invoke-virtual {v0, v10}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 746
    .line 747
    .line 748
    move-result v11

    .line 749
    if-ne v11, v13, :cond_18

    .line 750
    .line 751
    goto :goto_e

    .line 752
    :catch_2
    move-exception v0

    .line 753
    goto :goto_10

    .line 754
    :cond_18
    if-eqz v0, :cond_19

    .line 755
    .line 756
    invoke-virtual {v0, v13}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    .line 757
    .line 758
    .line 759
    move-result-object v10

    .line 760
    goto :goto_d

    .line 761
    :cond_19
    move-object v10, v5

    .line 762
    :goto_d
    if-eqz v10, :cond_1a

    .line 763
    .line 764
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 765
    .line 766
    .line 767
    move-result v11

    .line 768
    if-lez v11, :cond_1a

    .line 769
    .line 770
    const/4 v15, 0x0

    .line 771
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v10

    .line 775
    goto :goto_e

    .line 776
    :cond_1a
    move-object v10, v5

    .line 777
    :goto_e
    check-cast v10, Ljava/lang/String;

    .line 778
    .line 779
    if-eqz v10, :cond_1b

    .line 780
    .line 781
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 782
    .line 783
    .line 784
    move-result v11

    .line 785
    if-lez v11, :cond_1b

    .line 786
    .line 787
    if-eqz v0, :cond_1b

    .line 788
    .line 789
    invoke-virtual {v0, v10}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 790
    .line 791
    .line 792
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_2

    .line 793
    goto :goto_11

    .line 794
    :cond_1b
    :goto_f
    move-object v0, v5

    .line 795
    goto :goto_11

    .line 796
    :goto_10
    const-string v10, "mn0"

    .line 797
    .line 798
    const-string v11, "Exception occurred when retrieving location: %s"

    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-static {v10, v11, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    goto :goto_f

    .line 812
    :goto_11
    if-eqz v0, :cond_1e

    .line 813
    .line 814
    new-instance v10, Ljava/util/HashMap;

    .line 815
    .line 816
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    .line 820
    .line 821
    .line 822
    move-result-wide v11

    .line 823
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 824
    .line 825
    .line 826
    move-result-object v11

    .line 827
    invoke-static {v10, v4, v11}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    .line 831
    .line 832
    .line 833
    move-result-wide v11

    .line 834
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 835
    .line 836
    .line 837
    move-result-object v11

    .line 838
    invoke-static {v10, v3, v11}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 839
    .line 840
    .line 841
    const-string v11, "altitude"

    .line 842
    .line 843
    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    .line 844
    .line 845
    .line 846
    move-result-wide v12

    .line 847
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 848
    .line 849
    .line 850
    move-result-object v12

    .line 851
    invoke-static {v10, v11, v12}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 852
    .line 853
    .line 854
    const-string v11, "latitudeLongitudeAccuracy"

    .line 855
    .line 856
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    .line 857
    .line 858
    .line 859
    move-result v12

    .line 860
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 861
    .line 862
    .line 863
    move-result-object v12

    .line 864
    invoke-static {v10, v11, v12}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    const-string v11, "speed"

    .line 868
    .line 869
    invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F

    .line 870
    .line 871
    .line 872
    move-result v12

    .line 873
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 874
    .line 875
    .line 876
    move-result-object v12

    .line 877
    invoke-static {v10, v11, v12}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    const-string v11, "bearing"

    .line 881
    .line 882
    invoke-virtual {v0}, Landroid/location/Location;->getBearing()F

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-static {v10, v11, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    const-string v0, "timestamp"

    .line 894
    .line 895
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 896
    .line 897
    .line 898
    move-result-wide v11

    .line 899
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 900
    .line 901
    .line 902
    move-result-object v11

    .line 903
    invoke-static {v10, v0, v11}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    const/4 v3, 0x0

    .line 911
    :goto_12
    const/4 v4, 0x2

    .line 912
    if-ge v3, v4, :cond_1d

    .line 913
    .line 914
    aget-object v4, v0, v3

    .line 915
    .line 916
    invoke-virtual {v10, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v4

    .line 920
    if-nez v4, :cond_1c

    .line 921
    .line 922
    goto :goto_13

    .line 923
    :cond_1c
    add-int/lit8 v3, v3, 0x1

    .line 924
    .line 925
    goto :goto_12

    .line 926
    :cond_1d
    new-instance v0, Lb92;

    .line 927
    .line 928
    const-string v3, "iglu:com.snowplowanalytics.snowplow/geolocation_context/jsonschema/1-1-0"

    .line 929
    .line 930
    invoke-direct {v0, v3, v10}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 931
    .line 932
    .line 933
    goto :goto_14

    .line 934
    :cond_1e
    :goto_13
    move-object v0, v5

    .line 935
    :goto_14
    if-eqz v0, :cond_1f

    .line 936
    .line 937
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    check-cast v3, Ljava/util/ArrayList;

    .line 942
    .line 943
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    :cond_1f
    iget-object v0, v6, Luq2;->B:Lur3;

    .line 947
    .line 948
    if-eqz v0, :cond_20

    .line 949
    .line 950
    new-instance v3, Ljava/util/HashMap;

    .line 951
    .line 952
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 953
    .line 954
    .line 955
    const-string v4, "basisForProcessing"

    .line 956
    .line 957
    iget v10, v0, Lur3;->a:I

    .line 958
    .line 959
    packed-switch v10, :pswitch_data_1

    .line 960
    .line 961
    .line 962
    throw v5

    .line 963
    :pswitch_e
    const-string v10, "LEGITIMATE_INTERESTS"

    .line 964
    .line 965
    goto :goto_15

    .line 966
    :pswitch_f
    const-string v10, "PUBLIC_TASK"

    .line 967
    .line 968
    goto :goto_15

    .line 969
    :pswitch_10
    const-string v10, "VITAL_INTERESTS"

    .line 970
    .line 971
    goto :goto_15

    .line 972
    :pswitch_11
    const-string v10, "LEGAL_OBLIGATION"

    .line 973
    .line 974
    goto :goto_15

    .line 975
    :pswitch_12
    const-string v10, "CONTRACT"

    .line 976
    .line 977
    goto :goto_15

    .line 978
    :pswitch_13
    const-string v10, "CONSENT"

    .line 979
    .line 980
    :goto_15
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 981
    .line 982
    .line 983
    move-result-object v11

    .line 984
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v10

    .line 991
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v3, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    const-string v4, "documentId"

    .line 998
    .line 999
    iget-object v10, v0, Lur3;->b:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v10, Ljava/lang/String;

    .line 1002
    .line 1003
    invoke-virtual {v3, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    const-string v4, "documentVersion"

    .line 1007
    .line 1008
    iget-object v10, v0, Lur3;->c:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v10, Ljava/lang/String;

    .line 1011
    .line 1012
    invoke-virtual {v3, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    const-string v4, "documentDescription"

    .line 1016
    .line 1017
    iget-object v0, v0, Lur3;->d:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v0, Ljava/lang/String;

    .line 1020
    .line 1021
    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    new-instance v0, Lb92;

    .line 1025
    .line 1026
    const-string v4, "iglu:com.snowplowanalytics.snowplow/gdpr/jsonschema/1-0-0"

    .line 1027
    .line 1028
    invoke-direct {v0, v4, v3}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v3

    .line 1035
    check-cast v3, Ljava/util/ArrayList;

    .line 1036
    .line 1037
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    :cond_20
    :goto_16
    iget-object v3, v6, Luq2;->e:Lf31;

    .line 1041
    .line 1042
    monitor-enter v3

    .line 1043
    :try_start_6
    iget-object v0, v8, Lyq2;->a:Ljava/lang/String;

    .line 1044
    .line 1045
    if-nez v0, :cond_21

    .line 1046
    .line 1047
    iget-object v0, v8, Lyq2;->b:Ljava/lang/String;

    .line 1048
    .line 1049
    goto :goto_17

    .line 1050
    :catchall_2
    move-exception v0

    .line 1051
    goto/16 :goto_27

    .line 1052
    .line 1053
    :cond_21
    :goto_17
    new-instance v4, Ljava/util/LinkedList;

    .line 1054
    .line 1055
    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 1056
    .line 1057
    .line 1058
    new-instance v10, Ljava/util/LinkedList;

    .line 1059
    .line 1060
    invoke-direct {v10}, Ljava/util/LinkedList;-><init>()V

    .line 1061
    .line 1062
    .line 1063
    iget-object v11, v3, Lf31;->d:Ljava/lang/Object;

    .line 1064
    .line 1065
    check-cast v11, Ljava/util/HashMap;

    .line 1066
    .line 1067
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    check-cast v0, Ljava/util/List;

    .line 1072
    .line 1073
    if-eqz v0, :cond_22

    .line 1074
    .line 1075
    invoke-virtual {v10, v0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 1076
    .line 1077
    .line 1078
    :cond_22
    iget-object v0, v3, Lf31;->d:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v0, Ljava/util/HashMap;

    .line 1081
    .line 1082
    const-string v11, "*"

    .line 1083
    .line 1084
    invoke-virtual {v0, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    check-cast v0, Ljava/util/List;

    .line 1089
    .line 1090
    if-eqz v0, :cond_23

    .line 1091
    .line 1092
    invoke-virtual {v10, v0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 1093
    .line 1094
    .line 1095
    :cond_23
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    :cond_24
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1100
    .line 1101
    .line 1102
    move-result v10

    .line 1103
    if-eqz v10, :cond_26

    .line 1104
    .line 1105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v10

    .line 1109
    check-cast v10, Lq50;

    .line 1110
    .line 1111
    iget-object v11, v3, Lf31;->b:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v11, Ljava/util/HashMap;

    .line 1114
    .line 1115
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v11

    .line 1119
    check-cast v11, Ljava/lang/String;

    .line 1120
    .line 1121
    if-eqz v11, :cond_24

    .line 1122
    .line 1123
    iget-object v12, v8, Lyq2;->d:Lfs0;

    .line 1124
    .line 1125
    if-eqz v12, :cond_25

    .line 1126
    .line 1127
    invoke-virtual {v12, v11}, Lfs0;->r(Ljava/lang/String;)Lng2;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v11

    .line 1131
    invoke-virtual {v10, v8, v11}, Lq50;->a(Lyq2;Lng2;)Ljava/util/List;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v10

    .line 1135
    if-eqz v10, :cond_24

    .line 1136
    .line 1137
    invoke-virtual {v4, v10}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 1138
    .line 1139
    .line 1140
    goto :goto_18

    .line 1141
    :cond_25
    const-string v0, "state"

    .line 1142
    .line 1143
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    throw v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1147
    :cond_26
    monitor-exit v3

    .line 1148
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1153
    .line 1154
    .line 1155
    move-result v3

    .line 1156
    if-eqz v3, :cond_27

    .line 1157
    .line 1158
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v3

    .line 1162
    check-cast v3, Lb92;

    .line 1163
    .line 1164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v4

    .line 1171
    check-cast v4, Ljava/util/ArrayList;

    .line 1172
    .line 1173
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    goto :goto_19

    .line 1177
    :cond_27
    iget-boolean v0, v6, Luq2;->l:Z

    .line 1178
    .line 1179
    iget-boolean v3, v8, Lyq2;->h:Z

    .line 1180
    .line 1181
    if-eqz v3, :cond_28

    .line 1182
    .line 1183
    invoke-virtual {v8}, Lyq2;->b()Ljava/util/Map;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    invoke-virtual {v9, v0}, Lzq2;->c(Ljava/util/Map;)V

    .line 1188
    .line 1189
    .line 1190
    goto :goto_1a

    .line 1191
    :cond_28
    iget-object v3, v8, Lyq2;->a:Ljava/lang/String;

    .line 1192
    .line 1193
    if-nez v3, :cond_29

    .line 1194
    .line 1195
    goto :goto_1a

    .line 1196
    :cond_29
    new-instance v4, Lb92;

    .line 1197
    .line 1198
    invoke-virtual {v8}, Lyq2;->b()Ljava/util/Map;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v10

    .line 1202
    invoke-direct {v4, v3, v10}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1203
    .line 1204
    .line 1205
    new-instance v3, Ljava/util/HashMap;

    .line 1206
    .line 1207
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1208
    .line 1209
    .line 1210
    const-string v10, "schema"

    .line 1211
    .line 1212
    const-string v11, "iglu:com.snowplowanalytics.snowplow/unstruct_event/jsonschema/1-0-0"

    .line 1213
    .line 1214
    invoke-virtual {v3, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    const-string v10, "data"

    .line 1218
    .line 1219
    iget-object v4, v4, Lb92;->a:Ljava/util/HashMap;

    .line 1220
    .line 1221
    invoke-virtual {v3, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    const-string v4, "ue_px"

    .line 1225
    .line 1226
    const-string v10, "ue_pr"

    .line 1227
    .line 1228
    invoke-virtual {v9, v3, v0, v4, v10}, Lzq2;->b(Ljava/util/HashMap;ZLjava/lang/String;Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    :goto_1a
    iget-boolean v0, v6, Luq2;->l:Z

    .line 1232
    .line 1233
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v3

    .line 1237
    check-cast v3, Ljava/util/ArrayList;

    .line 1238
    .line 1239
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1240
    .line 1241
    .line 1242
    move-result v3

    .line 1243
    if-eqz v3, :cond_2a

    .line 1244
    .line 1245
    goto :goto_1c

    .line 1246
    :cond_2a
    new-instance v3, Ljava/util/LinkedList;

    .line 1247
    .line 1248
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v4

    .line 1255
    check-cast v4, Ljava/util/ArrayList;

    .line 1256
    .line 1257
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1262
    .line 1263
    .line 1264
    move-result v10

    .line 1265
    if-eqz v10, :cond_2b

    .line 1266
    .line 1267
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v10

    .line 1271
    check-cast v10, Lb92;

    .line 1272
    .line 1273
    iget-object v10, v10, Lb92;->a:Ljava/util/HashMap;

    .line 1274
    .line 1275
    invoke-virtual {v3, v10}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1276
    .line 1277
    .line 1278
    goto :goto_1b

    .line 1279
    :cond_2b
    new-instance v4, Lb92;

    .line 1280
    .line 1281
    const-string v10, "iglu:com.snowplowanalytics.snowplow/contexts/jsonschema/1-0-1"

    .line 1282
    .line 1283
    invoke-direct {v4, v10, v3}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1284
    .line 1285
    .line 1286
    iget-object v3, v4, Lb92;->a:Ljava/util/HashMap;

    .line 1287
    .line 1288
    const-string v4, "cx"

    .line 1289
    .line 1290
    const-string v10, "co"

    .line 1291
    .line 1292
    invoke-virtual {v9, v3, v0, v4, v10}, Lzq2;->b(Ljava/util/HashMap;ZLjava/lang/String;Ljava/lang/String;)V

    .line 1293
    .line 1294
    .line 1295
    :goto_1c
    iget-object v4, v6, Luq2;->e:Lf31;

    .line 1296
    .line 1297
    monitor-enter v4

    .line 1298
    :try_start_7
    iget-object v0, v8, Lyq2;->a:Ljava/lang/String;

    .line 1299
    .line 1300
    if-nez v0, :cond_2c

    .line 1301
    .line 1302
    iget-object v0, v8, Lyq2;->b:Ljava/lang/String;

    .line 1303
    .line 1304
    goto :goto_1d

    .line 1305
    :catchall_3
    move-exception v0

    .line 1306
    goto/16 :goto_26

    .line 1307
    .line 1308
    :cond_2c
    :goto_1d
    new-instance v3, Ljava/util/LinkedList;

    .line 1309
    .line 1310
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 1311
    .line 1312
    .line 1313
    iget-object v10, v4, Lf31;->g:Ljava/lang/Object;

    .line 1314
    .line 1315
    check-cast v10, Ljava/util/HashMap;

    .line 1316
    .line 1317
    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    check-cast v0, Ljava/util/List;

    .line 1322
    .line 1323
    if-eqz v0, :cond_2d

    .line 1324
    .line 1325
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 1326
    .line 1327
    .line 1328
    :cond_2d
    iget-object v0, v4, Lf31;->g:Ljava/lang/Object;

    .line 1329
    .line 1330
    check-cast v0, Ljava/util/HashMap;

    .line 1331
    .line 1332
    const-string v10, "*"

    .line 1333
    .line 1334
    invoke-virtual {v0, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    check-cast v0, Ljava/util/List;

    .line 1339
    .line 1340
    if-eqz v0, :cond_2e

    .line 1341
    .line 1342
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 1343
    .line 1344
    .line 1345
    :cond_2e
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v0

    .line 1349
    :cond_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1350
    .line 1351
    .line 1352
    move-result v3

    .line 1353
    if-eqz v3, :cond_33

    .line 1354
    .line 1355
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v3

    .line 1359
    check-cast v3, Lq50;

    .line 1360
    .line 1361
    iget-object v10, v4, Lf31;->b:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v10, Ljava/util/HashMap;

    .line 1364
    .line 1365
    invoke-virtual {v10, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v10

    .line 1369
    check-cast v10, Ljava/lang/String;

    .line 1370
    .line 1371
    if-eqz v10, :cond_2f

    .line 1372
    .line 1373
    iget-object v11, v8, Lyq2;->d:Lfs0;

    .line 1374
    .line 1375
    if-eqz v11, :cond_32

    .line 1376
    .line 1377
    invoke-virtual {v11, v10}, Lfs0;->r(Ljava/lang/String;)Lng2;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v10

    .line 1381
    iget v3, v3, Lq50;->a:I

    .line 1382
    .line 1383
    packed-switch v3, :pswitch_data_2

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    iget-object v3, v8, Lyq2;->a:Ljava/lang/String;

    .line 1390
    .line 1391
    const-string v11, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0"

    .line 1392
    .line 1393
    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v3

    .line 1397
    if-eqz v3, :cond_31

    .line 1398
    .line 1399
    if-eqz v10, :cond_30

    .line 1400
    .line 1401
    const/4 v3, 0x1

    .line 1402
    goto :goto_1e

    .line 1403
    :cond_30
    const/4 v3, 0x0

    .line 1404
    :goto_1e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v3

    .line 1408
    goto :goto_20

    .line 1409
    :cond_31
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1410
    .line 1411
    goto :goto_20

    .line 1412
    :goto_1f
    move-object v3, v5

    .line 1413
    goto :goto_20

    .line 1414
    :pswitch_14
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1415
    .line 1416
    .line 1417
    goto :goto_1f

    .line 1418
    :goto_20
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1419
    .line 1420
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1421
    .line 1422
    .line 1423
    move-result v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1424
    if-eqz v3, :cond_2f

    .line 1425
    .line 1426
    monitor-exit v4

    .line 1427
    move-object v9, v5

    .line 1428
    goto/16 :goto_24

    .line 1429
    .line 1430
    :cond_32
    :try_start_8
    const-string v0, "state"

    .line 1431
    .line 1432
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 1433
    .line 1434
    .line 1435
    throw v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1436
    :cond_33
    monitor-exit v4

    .line 1437
    iget-boolean v0, v8, Lyq2;->h:Z

    .line 1438
    .line 1439
    if-nez v0, :cond_3a

    .line 1440
    .line 1441
    const-string v0, "referrer"

    .line 1442
    .line 1443
    const-string v3, "url"

    .line 1444
    .line 1445
    iget-object v4, v8, Lyq2;->a:Ljava/lang/String;

    .line 1446
    .line 1447
    const-string v10, "iglu:com.snowplowanalytics.mobile/deep_link_received/jsonschema/1-0-0"

    .line 1448
    .line 1449
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1450
    .line 1451
    .line 1452
    move-result v4

    .line 1453
    if-eqz v4, :cond_36

    .line 1454
    .line 1455
    invoke-virtual {v8}, Lyq2;->b()Ljava/util/Map;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v4

    .line 1459
    check-cast v4, Ljava/util/HashMap;

    .line 1460
    .line 1461
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v4

    .line 1465
    instance-of v10, v4, Ljava/lang/String;

    .line 1466
    .line 1467
    if-eqz v10, :cond_34

    .line 1468
    .line 1469
    check-cast v4, Ljava/lang/String;

    .line 1470
    .line 1471
    goto :goto_21

    .line 1472
    :cond_34
    move-object v4, v5

    .line 1473
    :goto_21
    invoke-virtual {v8}, Lyq2;->b()Ljava/util/Map;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v10

    .line 1477
    check-cast v10, Ljava/util/HashMap;

    .line 1478
    .line 1479
    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v0

    .line 1483
    instance-of v10, v0, Ljava/lang/String;

    .line 1484
    .line 1485
    if-eqz v10, :cond_35

    .line 1486
    .line 1487
    check-cast v0, Ljava/lang/String;

    .line 1488
    .line 1489
    goto :goto_23

    .line 1490
    :cond_35
    move-object v0, v5

    .line 1491
    goto :goto_23

    .line 1492
    :cond_36
    iget-object v0, v8, Lyq2;->a:Ljava/lang/String;

    .line 1493
    .line 1494
    const-string v4, "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0"

    .line 1495
    .line 1496
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1497
    .line 1498
    .line 1499
    move-result v0

    .line 1500
    if-eqz v0, :cond_38

    .line 1501
    .line 1502
    invoke-virtual {v8}, Lyq2;->a()Ljava/util/List;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    check-cast v0, Ljava/util/ArrayList;

    .line 1507
    .line 1508
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1513
    .line 1514
    .line 1515
    move-result v4

    .line 1516
    if-eqz v4, :cond_38

    .line 1517
    .line 1518
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v4

    .line 1522
    check-cast v4, Lb92;

    .line 1523
    .line 1524
    instance-of v4, v4, Lo50;

    .line 1525
    .line 1526
    if-nez v4, :cond_37

    .line 1527
    .line 1528
    goto :goto_22

    .line 1529
    :cond_37
    throw v5

    .line 1530
    :cond_38
    move-object v0, v5

    .line 1531
    move-object v4, v0

    .line 1532
    :goto_23
    if-eqz v4, :cond_39

    .line 1533
    .line 1534
    invoke-static {v4}, Lmn0;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v4

    .line 1538
    invoke-virtual {v9, v3, v4}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1539
    .line 1540
    .line 1541
    :cond_39
    if-eqz v0, :cond_3a

    .line 1542
    .line 1543
    const-string v3, "refr"

    .line 1544
    .line 1545
    invoke-static {v0}, Lmn0;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    invoke-virtual {v9, v3, v0}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1550
    .line 1551
    .line 1552
    :cond_3a
    :goto_24
    if-eqz v9, :cond_3b

    .line 1553
    .line 1554
    const-string v0, "uq2"

    .line 1555
    .line 1556
    const-string v3, "Adding new payload to event storage: %s"

    .line 1557
    .line 1558
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v4

    .line 1562
    invoke-static {v0, v3, v4}, Lk50;->L(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1563
    .line 1564
    .line 1565
    iget-object v0, v6, Luq2;->i:Ljc0;

    .line 1566
    .line 1567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1568
    .line 1569
    .line 1570
    iget-object v3, v0, Ljc0;->a:Ljava/lang/String;

    .line 1571
    .line 1572
    new-instance v4, Lj8;

    .line 1573
    .line 1574
    const/16 v10, 0x15

    .line 1575
    .line 1576
    invoke-direct {v4, v10, v0, v9}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1577
    .line 1578
    .line 1579
    const/4 v15, 0x0

    .line 1580
    invoke-static {v3, v15, v4}, Lmf0;->a(Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 1581
    .line 1582
    .line 1583
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1584
    .line 1585
    .line 1586
    iget-object v0, v6, Luq2;->e:Lf31;

    .line 1587
    .line 1588
    invoke-virtual {v0, v8}, Lf31;->b(Lyq2;)V

    .line 1589
    .line 1590
    .line 1591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1592
    .line 1593
    goto :goto_25

    .line 1594
    :cond_3b
    move-object v0, v5

    .line 1595
    :goto_25
    if-nez v0, :cond_3c

    .line 1596
    .line 1597
    const-string v0, "uq2"

    .line 1598
    .line 1599
    const-string v3, "Event not tracked due to filtering: %s"

    .line 1600
    .line 1601
    iget-object v4, v8, Lyq2;->f:Ljava/util/UUID;

    .line 1602
    .line 1603
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v4

    .line 1607
    invoke-static {v0, v3, v4}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1611
    .line 1612
    .line 1613
    :cond_3c
    const/4 v3, 0x0

    .line 1614
    goto/16 :goto_0

    .line 1615
    .line 1616
    :goto_26
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1617
    throw v0

    .line 1618
    :goto_27
    :try_start_a
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 1619
    throw v0

    .line 1620
    :goto_28
    :try_start_b
    monitor-exit v10
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 1621
    throw v0

    .line 1622
    :cond_3d
    return-void

    .line 1623
    :pswitch_15
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1624
    .line 1625
    check-cast v1, Landroid/webkit/WebView;

    .line 1626
    .line 1627
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1628
    .line 1629
    check-cast v0, Ljava/lang/String;

    .line 1630
    .line 1631
    sget v2, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->c:I

    .line 1632
    .line 1633
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1634
    .line 1635
    const-string v3, "window.__bridgePostIndex = window.__bridgePostIndex || 1;window.bridge = {"

    .line 1636
    .line 1637
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1641
    .line 1642
    .line 1643
    const-string v0, "postMessage: function(name, body) {return new Promise((resolve, reject) => {const callbackId = Math.random().toString() + \'_\' + (++window.__bridgePostIndex).toString();window.__bridgeCallbacks = window.__bridgeCallbacks || {};window.__bridgeCallbacks[callbackId] = resolve;window.messageHandler.postMessage(name, body, callbackId);});}};if (window.__bridgeResolve) {window.__bridgeResolve(window.bridge);delete window.__bridgeResolve;}console.log(\"TitanWebView window.bridge ready!\");"

    .line 1644
    .line 1645
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v0

    .line 1652
    invoke-virtual {v1, v0, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1653
    .line 1654
    .line 1655
    return-void

    .line 1656
    :pswitch_16
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1657
    .line 1658
    check-cast v1, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 1659
    .line 1660
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1661
    .line 1662
    check-cast v0, Landroid/webkit/WebView;

    .line 1663
    .line 1664
    sget v2, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->c:I

    .line 1665
    .line 1666
    const-string v2, "typeof window.bridge !== \'undefined\' && typeof window.bridge.postMessage === \'function\'"

    .line 1667
    .line 1668
    new-instance v3, Lqp2;

    .line 1669
    .line 1670
    invoke-direct {v3, v1, v0}, Lqp2;-><init>(Lcom/supercell/titan/TitanWebView$TitanWebViewClient;Landroid/webkit/WebView;)V

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v0, v2, v3}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1674
    .line 1675
    .line 1676
    return-void

    .line 1677
    :pswitch_17
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1678
    .line 1679
    check-cast v1, Lcom/supercell/titan/TitanWebView;

    .line 1680
    .line 1681
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1682
    .line 1683
    check-cast v0, Lcom/supercell/titan/GameApp;

    .line 1684
    .line 1685
    iget-object v3, v1, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 1686
    .line 1687
    if-nez v3, :cond_3e

    .line 1688
    .line 1689
    goto :goto_2a

    .line 1690
    :cond_3e
    const/4 v4, 0x0

    .line 1691
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1695
    .line 1696
    .line 1697
    iget-object v2, v1, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 1698
    .line 1699
    const/16 v3, 0x8

    .line 1700
    .line 1701
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1702
    .line 1703
    .line 1704
    iget-object v2, v1, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 1705
    .line 1706
    if-nez v2, :cond_3f

    .line 1707
    .line 1708
    goto :goto_29

    .line 1709
    :cond_3f
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v3

    .line 1713
    const-string v4, "input_method"

    .line 1714
    .line 1715
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v4

    .line 1719
    check-cast v4, Landroid/view/inputmethod/InputMethodManager;

    .line 1720
    .line 1721
    if-eqz v4, :cond_40

    .line 1722
    .line 1723
    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v5

    .line 1727
    const/4 v15, 0x0

    .line 1728
    invoke-virtual {v4, v5, v15}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1729
    .line 1730
    .line 1731
    :cond_40
    invoke-virtual {v2}, Landroid/view/View;->clearFocus()V

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v3}, Lcom/supercell/titan/GameApp;->setSystemUiVisibility()V

    .line 1735
    .line 1736
    .line 1737
    const-wide/16 v4, 0x7d0

    .line 1738
    .line 1739
    invoke-virtual {v3, v4, v5}, Lcom/supercell/titan/GameApp;->setSystemUiVisibilityDelayed(J)V

    .line 1740
    .line 1741
    .line 1742
    :goto_29
    iget v1, v1, Lcom/supercell/titan/TitanWebView;->A:I

    .line 1743
    .line 1744
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v0

    .line 1748
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 1749
    .line 1750
    .line 1751
    :goto_2a
    return-void

    .line 1752
    :pswitch_18
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1753
    .line 1754
    check-cast v1, Lcom/supercell/titan/TitanWebView;

    .line 1755
    .line 1756
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1757
    .line 1758
    check-cast v0, Lcom/supercell/titan/TitanWebView;

    .line 1759
    .line 1760
    iget-object v1, v1, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 1761
    .line 1762
    if-nez v1, :cond_41

    .line 1763
    .line 1764
    goto :goto_2b

    .line 1765
    :cond_41
    new-instance v2, Landroid/view/GestureDetector;

    .line 1766
    .line 1767
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v3

    .line 1771
    new-instance v4, Lop2;

    .line 1772
    .line 1773
    invoke-direct {v4, v0}, Lop2;-><init>(Lcom/supercell/titan/TitanWebView;)V

    .line 1774
    .line 1775
    .line 1776
    invoke-direct {v2, v3, v4}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 1777
    .line 1778
    .line 1779
    new-instance v0, Ld41;

    .line 1780
    .line 1781
    const/4 v13, 0x1

    .line 1782
    invoke-direct {v0, v2, v13}, Ld41;-><init>(Ljava/lang/Object;I)V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1786
    .line 1787
    .line 1788
    :goto_2b
    return-void

    .line 1789
    :pswitch_19
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1790
    .line 1791
    check-cast v1, Lmj2;

    .line 1792
    .line 1793
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1794
    .line 1795
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1796
    .line 1797
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v0

    .line 1801
    check-cast v0, Lc00;

    .line 1802
    .line 1803
    new-instance v2, Ltg;

    .line 1804
    .line 1805
    invoke-direct {v2, v1}, Ltg;-><init>(Lmj2;)V

    .line 1806
    .line 1807
    .line 1808
    invoke-interface {v0, v2}, Lc00;->accept(Ljava/lang/Object;)V

    .line 1809
    .line 1810
    .line 1811
    return-void

    .line 1812
    :pswitch_1a
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1813
    .line 1814
    check-cast v1, Ljava/util/LinkedList;

    .line 1815
    .line 1816
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1817
    .line 1818
    check-cast v0, Lyq2;

    .line 1819
    .line 1820
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1821
    .line 1822
    .line 1823
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v1

    .line 1827
    :goto_2c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1828
    .line 1829
    .line 1830
    move-result v2

    .line 1831
    if-eqz v2, :cond_42

    .line 1832
    .line 1833
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v2

    .line 1837
    check-cast v2, Lq50;

    .line 1838
    .line 1839
    iget v2, v2, Lq50;->a:I

    .line 1840
    .line 1841
    packed-switch v2, :pswitch_data_3

    .line 1842
    .line 1843
    .line 1844
    :pswitch_1b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1845
    .line 1846
    .line 1847
    goto :goto_2c

    .line 1848
    :cond_42
    return-void

    .line 1849
    :pswitch_1c
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1850
    .line 1851
    check-cast v1, Lc00;

    .line 1852
    .line 1853
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1854
    .line 1855
    check-cast v0, Lkn;

    .line 1856
    .line 1857
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1858
    .line 1859
    .line 1860
    invoke-interface {v1, v0}, Lc00;->accept(Ljava/lang/Object;)V

    .line 1861
    .line 1862
    .line 1863
    return-void

    .line 1864
    :pswitch_1d
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1865
    .line 1866
    check-cast v1, Lcp0;

    .line 1867
    .line 1868
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1869
    .line 1870
    check-cast v0, Ljava/lang/String;

    .line 1871
    .line 1872
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1873
    .line 1874
    check-cast v1, Lcom/supercell/titan/ScExternalWebView;

    .line 1875
    .line 1876
    invoke-virtual {v1, v0}, Lcom/supercell/titan/ScExternalWebView;->onPageFailed(Ljava/lang/String;)V

    .line 1877
    .line 1878
    .line 1879
    return-void

    .line 1880
    :pswitch_1e
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1881
    .line 1882
    check-cast v1, Lcom/supercell/titan/ScExternalWebView;

    .line 1883
    .line 1884
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1885
    .line 1886
    check-cast v0, Lcom/supercell/titan/GameApp;

    .line 1887
    .line 1888
    new-instance v2, Le72;

    .line 1889
    .line 1890
    invoke-direct {v2, v1}, Le72;-><init>(Lcom/supercell/titan/ScExternalWebView;)V

    .line 1891
    .line 1892
    .line 1893
    iput-object v2, v1, Lcom/supercell/titan/ScExternalWebView;->i:Le72;

    .line 1894
    .line 1895
    new-instance v2, Lc72;

    .line 1896
    .line 1897
    invoke-direct {v2, v1}, Lc72;-><init>(Lcom/supercell/titan/ScExternalWebView;)V

    .line 1898
    .line 1899
    .line 1900
    iput-object v2, v1, Lcom/supercell/titan/ScExternalWebView;->d:Lc72;

    .line 1901
    .line 1902
    const-string v2, "com.android.chrome"

    .line 1903
    .line 1904
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v0

    .line 1908
    iget-object v3, v1, Lcom/supercell/titan/ScExternalWebView;->d:Lc72;

    .line 1909
    .line 1910
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v4

    .line 1914
    invoke-virtual {v3, v4}, Ll30;->setApplicationContext(Landroid/content/Context;)V

    .line 1915
    .line 1916
    .line 1917
    new-instance v4, Landroid/content/Intent;

    .line 1918
    .line 1919
    const-string v5, "android.support.customtabs.action.CustomTabsService"

    .line 1920
    .line 1921
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1922
    .line 1923
    .line 1924
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1925
    .line 1926
    .line 1927
    move-result v5

    .line 1928
    if-nez v5, :cond_43

    .line 1929
    .line 1930
    invoke-virtual {v4, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1931
    .line 1932
    .line 1933
    :cond_43
    const/16 v2, 0x21

    .line 1934
    .line 1935
    invoke-virtual {v0, v4, v3, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 1936
    .line 1937
    .line 1938
    move-result v0

    .line 1939
    if-nez v0, :cond_44

    .line 1940
    .line 1941
    const-string v0, "ScExternalWebView"

    .line 1942
    .line 1943
    const-string v2, "Could not bind to Custom Tabs service, callbacks may not work"

    .line 1944
    .line 1945
    invoke-static {v0, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 1946
    .line 1947
    .line 1948
    :cond_44
    new-instance v0, Li30;

    .line 1949
    .line 1950
    invoke-direct {v0}, Li30;-><init>()V

    .line 1951
    .line 1952
    .line 1953
    iget-object v2, v0, Li30;->a:Landroid/content/Intent;

    .line 1954
    .line 1955
    const-string v3, "android.support.customtabs.extra.TITLE_VISIBILITY"

    .line 1956
    .line 1957
    const/4 v13, 0x1

    .line 1958
    invoke-virtual {v2, v3, v13}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1959
    .line 1960
    .line 1961
    invoke-virtual {v0}, Li30;->a()Lj30;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v0

    .line 1965
    iput-object v0, v1, Lcom/supercell/titan/ScExternalWebView;->b:Lj30;

    .line 1966
    .line 1967
    return-void

    .line 1968
    :pswitch_1f
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 1969
    .line 1970
    check-cast v1, Lcom/supercell/titan/ScExternalWebView;

    .line 1971
    .line 1972
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 1973
    .line 1974
    move-object v2, v0

    .line 1975
    check-cast v2, Ljava/lang/String;

    .line 1976
    .line 1977
    const-string v0, "android.intent.action.VIEW"

    .line 1978
    .line 1979
    const-string v3, "ScExternalWebView"

    .line 1980
    .line 1981
    :try_start_c
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v4

    .line 1985
    iget-object v5, v1, Lcom/supercell/titan/ScExternalWebView;->i:Le72;

    .line 1986
    .line 1987
    if-eqz v5, :cond_45

    .line 1988
    .line 1989
    iput-object v2, v5, Le72;->a:Ljava/lang/String;

    .line 1990
    .line 1991
    const/4 v15, 0x0

    .line 1992
    iput-boolean v15, v5, Le72;->b:Z

    .line 1993
    .line 1994
    :cond_45
    invoke-virtual {v1}, Lcom/supercell/titan/ScExternalWebView;->a()V

    .line 1995
    .line 1996
    .line 1997
    iget-wide v5, v1, Lcom/supercell/titan/ScExternalWebView;->g:J

    .line 1998
    .line 1999
    const-wide/16 v7, 0x0

    .line 2000
    .line 2001
    cmp-long v7, v5, v7

    .line 2002
    .line 2003
    if-lez v7, :cond_46

    .line 2004
    .line 2005
    new-instance v7, Lcp0;

    .line 2006
    .line 2007
    const/16 v8, 0x13

    .line 2008
    .line 2009
    const/4 v15, 0x0

    .line 2010
    invoke-direct {v7, v1, v2, v8, v15}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 2011
    .line 2012
    .line 2013
    iput-object v7, v1, Lcom/supercell/titan/ScExternalWebView;->f:Lcp0;

    .line 2014
    .line 2015
    iget-object v8, v1, Lcom/supercell/titan/ScExternalWebView;->e:Landroid/os/Handler;

    .line 2016
    .line 2017
    invoke-virtual {v8, v7, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2018
    .line 2019
    .line 2020
    :cond_46
    iget-object v5, v1, Lcom/supercell/titan/ScExternalWebView;->b:Lj30;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    .line 2021
    .line 2022
    if-eqz v5, :cond_47

    .line 2023
    .line 2024
    :try_start_d
    iget-object v5, v5, Lj30;->a:Landroid/content/Intent;

    .line 2025
    .line 2026
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2027
    .line 2028
    .line 2029
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v5

    .line 2033
    iget-object v6, v1, Lcom/supercell/titan/ScExternalWebView;->b:Lj30;

    .line 2034
    .line 2035
    iget-object v6, v6, Lj30;->a:Landroid/content/Intent;

    .line 2036
    .line 2037
    const v7, 0xa04c

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual {v5, v6, v7}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2041
    .line 2042
    .line 2043
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v5

    .line 2047
    new-instance v6, Lcom/supercell/titan/j;

    .line 2048
    .line 2049
    invoke-direct {v6, v1}, Lcom/supercell/titan/j;-><init>(Lcom/supercell/titan/ScExternalWebView;)V

    .line 2050
    .line 2051
    .line 2052
    invoke-virtual {v5, v6}, Lcom/supercell/titan/GameApp;->addActivityResultListener(Lcom/supercell/titan/GameApp$OnActivityResultListener;)V

    .line 2053
    .line 2054
    .line 2055
    const/4 v13, 0x1

    .line 2056
    iput-boolean v13, v1, Lcom/supercell/titan/ScExternalWebView;->a:Z
    :try_end_d
    .catch Landroid/content/ActivityNotFoundException; {:try_start_d .. :try_end_d} :catch_4
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3

    .line 2057
    .line 2058
    goto :goto_2e

    .line 2059
    :catch_3
    move-exception v0

    .line 2060
    goto :goto_2d

    .line 2061
    :catch_4
    :try_start_e
    invoke-virtual {v1}, Lcom/supercell/titan/ScExternalWebView;->a()V

    .line 2062
    .line 2063
    .line 2064
    const-string v5, "Custom Tabs not available, falling back to browser"

    .line 2065
    .line 2066
    invoke-static {v3, v5}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 2067
    .line 2068
    .line 2069
    new-instance v5, Landroid/content/Intent;

    .line 2070
    .line 2071
    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2072
    .line 2073
    .line 2074
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v0

    .line 2078
    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2079
    .line 2080
    .line 2081
    const/4 v15, 0x0

    .line 2082
    iput-boolean v15, v1, Lcom/supercell/titan/ScExternalWebView;->a:Z

    .line 2083
    .line 2084
    goto :goto_2e

    .line 2085
    :cond_47
    invoke-virtual {v1}, Lcom/supercell/titan/ScExternalWebView;->a()V

    .line 2086
    .line 2087
    .line 2088
    new-instance v5, Landroid/content/Intent;

    .line 2089
    .line 2090
    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2091
    .line 2092
    .line 2093
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v0

    .line 2097
    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2098
    .line 2099
    .line 2100
    const/4 v15, 0x0

    .line 2101
    iput-boolean v15, v1, Lcom/supercell/titan/ScExternalWebView;->a:Z
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3

    .line 2102
    .line 2103
    goto :goto_2e

    .line 2104
    :goto_2d
    invoke-virtual {v1}, Lcom/supercell/titan/ScExternalWebView;->a()V

    .line 2105
    .line 2106
    .line 2107
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2108
    .line 2109
    const-string v5, "Failed to open URL: "

    .line 2110
    .line 2111
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2112
    .line 2113
    .line 2114
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2115
    .line 2116
    .line 2117
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v2

    .line 2121
    invoke-static {v3, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2122
    .line 2123
    .line 2124
    const/4 v15, 0x0

    .line 2125
    iput-boolean v15, v1, Lcom/supercell/titan/ScExternalWebView;->a:Z

    .line 2126
    .line 2127
    :goto_2e
    return-void

    .line 2128
    :pswitch_20
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 2129
    .line 2130
    check-cast v1, Lde3;

    .line 2131
    .line 2132
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 2133
    .line 2134
    check-cast v0, Landroid/graphics/Typeface;

    .line 2135
    .line 2136
    invoke-virtual {v1, v0}, Lde3;->B(Landroid/graphics/Typeface;)V

    .line 2137
    .line 2138
    .line 2139
    return-void

    .line 2140
    :pswitch_21
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 2141
    .line 2142
    check-cast v1, Luw1;

    .line 2143
    .line 2144
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 2145
    .line 2146
    check-cast v0, Lrj2;

    .line 2147
    .line 2148
    invoke-interface {v1, v0}, Luw1;->d(Lrj2;)V

    .line 2149
    .line 2150
    .line 2151
    return-void

    .line 2152
    :pswitch_22
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 2153
    .line 2154
    check-cast v1, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 2155
    .line 2156
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 2157
    .line 2158
    check-cast v0, Lmj1;

    .line 2159
    .line 2160
    const-string v2, "textureId"

    .line 2161
    .line 2162
    iget-wide v3, v0, Lmj1;->d:J

    .line 2163
    .line 2164
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v3

    .line 2168
    new-instance v4, Lkotlin/Pair;

    .line 2169
    .line 2170
    invoke-direct {v4, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2171
    .line 2172
    .line 2173
    const-string v2, "rotation"

    .line 2174
    .line 2175
    iget v3, v0, Lmj1;->c:I

    .line 2176
    .line 2177
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v3

    .line 2181
    new-instance v5, Lkotlin/Pair;

    .line 2182
    .line 2183
    invoke-direct {v5, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2184
    .line 2185
    .line 2186
    const-string v2, "size"

    .line 2187
    .line 2188
    const-string v3, "width"

    .line 2189
    .line 2190
    iget-wide v6, v0, Lmj1;->a:D

    .line 2191
    .line 2192
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v6

    .line 2196
    new-instance v7, Lkotlin/Pair;

    .line 2197
    .line 2198
    invoke-direct {v7, v3, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2199
    .line 2200
    .line 2201
    const-string v3, "height"

    .line 2202
    .line 2203
    iget-wide v8, v0, Lmj1;->b:D

    .line 2204
    .line 2205
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v0

    .line 2209
    new-instance v6, Lkotlin/Pair;

    .line 2210
    .line 2211
    invoke-direct {v6, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2212
    .line 2213
    .line 2214
    filled-new-array {v7, v6}, [Lkotlin/Pair;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v0

    .line 2218
    invoke-static {v0}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v0

    .line 2222
    new-instance v3, Lkotlin/Pair;

    .line 2223
    .line 2224
    invoke-direct {v3, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2225
    .line 2226
    .line 2227
    filled-new-array {v4, v5, v3}, [Lkotlin/Pair;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v0

    .line 2231
    invoke-static {v0}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v0

    .line 2235
    invoke-interface {v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2236
    .line 2237
    .line 2238
    return-void

    .line 2239
    :pswitch_23
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 2240
    .line 2241
    check-cast v1, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 2242
    .line 2243
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 2244
    .line 2245
    check-cast v0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;

    .line 2246
    .line 2247
    invoke-static {v1, v0}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->f(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;)V

    .line 2248
    .line 2249
    .line 2250
    return-void

    .line 2251
    :pswitch_24
    iget-object v1, v0, Lji1;->b:Ljava/lang/Object;

    .line 2252
    .line 2253
    check-cast v1, Lli1;

    .line 2254
    .line 2255
    iget-object v0, v0, Lji1;->c:Ljava/lang/Object;

    .line 2256
    .line 2257
    check-cast v0, Lnw0;

    .line 2258
    .line 2259
    invoke-interface {v0, v1}, Lnw0;->f(Low0;)V

    .line 2260
    .line 2261
    .line 2262
    return-void

    .line 2263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch

    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
    .end packed-switch
.end method
