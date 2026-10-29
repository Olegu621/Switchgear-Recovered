.class public final Lio/sentry/android/core/SentryPerformanceProvider;
.super Lio/sentry/android/core/u0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final e:J

.field public static final synthetic f:I


# instance fields
.field public b:Landroid/app/Application;

.field public final c:Lio/sentry/android/core/u;

.field public final d:Lio/sentry/android/core/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sput-wide v0, Lio/sentry/android/core/SentryPerformanceProvider;->e:J

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lio/sentry/android/core/u0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a;

    .line 5
    .line 6
    new-instance v0, Lio/sentry/android/core/u;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-direct {v0, v1}, Lio/sentry/android/core/u;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/android/core/u;

    .line 13
    .line 14
    new-instance v1, Lio/sentry/android/core/o0;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lio/sentry/android/core/o0;-><init>(Lio/sentry/ILogger;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/o0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lio/sentry/n4;Lio/sentry/android/core/performance/g;)V
    .locals 9

    .line 1
    iget-boolean v0, p2, Lio/sentry/n4;->w:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v5, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/android/core/u;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 9
    .line 10
    const-string p1, "App start profiling was not sampled. It will not start."

    .line 11
    .line 12
    new-array p2, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v5, p0, p1, p2}, Lio/sentry/android/core/u;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Lio/sentry/g5;

    .line 19
    .line 20
    invoke-direct {v0}, Lio/sentry/g5;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lio/sentry/android/core/h;

    .line 24
    .line 25
    new-instance v4, Lio/sentry/android/core/internal/util/r;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v3, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/o0;

    .line 32
    .line 33
    invoke-direct {v4, p1, v5, v3}, Lio/sentry/android/core/internal/util/r;-><init>(Landroid/content/Context;Lio/sentry/android/core/u;Lio/sentry/android/core/o0;)V

    .line 34
    .line 35
    .line 36
    iget-object v6, p2, Lio/sentry/n4;->e:Ljava/lang/String;

    .line 37
    .line 38
    iget v7, p2, Lio/sentry/n4;->v:I

    .line 39
    .line 40
    new-instance v8, Lio/sentry/android/core/h1;

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    invoke-direct {v8, v0, p1}, Lio/sentry/android/core/h1;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/o0;

    .line 47
    .line 48
    invoke-direct/range {v2 .. v8}, Lio/sentry/android/core/h;-><init>(Lio/sentry/android/core/o0;Lio/sentry/android/core/internal/util/r;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/util/f;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    iput-object p0, p3, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 53
    .line 54
    iput-object v2, p3, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;

    .line 55
    .line 56
    sget-object p0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 57
    .line 58
    const-string p1, "App start continuous profiling started."

    .line 59
    .line 60
    new-array p3, v1, [Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v5, p0, p1, p3}, Lio/sentry/android/core/u;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lio/sentry/m6;->empty()Lio/sentry/m6;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-boolean p1, p2, Lio/sentry/n4;->w:Z

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Lio/sentry/m6;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p2, Lio/sentry/n4;->W:Lio/sentry/q3;

    .line 86
    .line 87
    new-instance p2, Lio/sentry/i7;

    .line 88
    .line 89
    invoke-direct {p2, p0}, Lio/sentry/i7;-><init>(Lio/sentry/m6;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, p1, p2}, Lio/sentry/android/core/h;->c(Lio/sentry/q3;Lio/sentry/i7;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    .line 1
    const-class v0, Lio/sentry/android/core/SentryPerformanceProvider;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "An applicationId is required to fulfill the manifest placeholder."

    .line 20
    .line 21
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final b(Landroid/content/Context;Lio/sentry/n4;Lio/sentry/android/core/performance/g;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    new-instance v3, Lio/sentry/t3;

    .line 8
    .line 9
    iget-boolean v9, v1, Lio/sentry/n4;->c:Z

    .line 10
    .line 11
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object v5, v1, Lio/sentry/n4;->d:Ljava/lang/Double;

    .line 16
    .line 17
    iget-boolean v6, v1, Lio/sentry/n4;->a:Z

    .line 18
    .line 19
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    iget-object v8, v1, Lio/sentry/n4;->b:Ljava/lang/Double;

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-direct/range {v3 .. v8}, Lio/sentry/t3;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 27
    .line 28
    .line 29
    iput-object v3, v2, Lio/sentry/android/core/performance/g;->V:Lio/sentry/t3;

    .line 30
    .line 31
    iget-object v3, v3, Lio/sentry/t3;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    iget-object v14, v0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/android/core/u;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    if-nez v9, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v3, Lio/sentry/g5;

    .line 48
    .line 49
    invoke-direct {v3}, Lio/sentry/g5;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v10, Lio/sentry/android/core/v;

    .line 53
    .line 54
    new-instance v13, Lio/sentry/android/core/internal/util/r;

    .line 55
    .line 56
    iget-object v12, v0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/o0;

    .line 57
    .line 58
    move-object/from16 v11, p1

    .line 59
    .line 60
    invoke-direct {v13, v11, v14, v12}, Lio/sentry/android/core/internal/util/r;-><init>(Landroid/content/Context;Lio/sentry/android/core/u;Lio/sentry/android/core/o0;)V

    .line 61
    .line 62
    .line 63
    iget-object v15, v1, Lio/sentry/n4;->e:Ljava/lang/String;

    .line 64
    .line 65
    iget-boolean v0, v1, Lio/sentry/n4;->f:Z

    .line 66
    .line 67
    iget v1, v1, Lio/sentry/n4;->v:I

    .line 68
    .line 69
    new-instance v5, Lio/sentry/android/core/h1;

    .line 70
    .line 71
    const/4 v6, 0x1

    .line 72
    invoke-direct {v5, v3, v6}, Lio/sentry/android/core/h1;-><init>(Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    move/from16 v16, v0

    .line 76
    .line 77
    move/from16 v17, v1

    .line 78
    .line 79
    move-object/from16 v18, v5

    .line 80
    .line 81
    invoke-direct/range {v10 .. v18}, Lio/sentry/android/core/v;-><init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/internal/util/r;Lio/sentry/ILogger;Ljava/lang/String;ZILio/sentry/util/f;)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    iput-object v0, v2, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;

    .line 86
    .line 87
    iput-object v10, v2, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 88
    .line 89
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 90
    .line 91
    const-string v1, "App start profiling started."

    .line 92
    .line 93
    new-array v2, v4, [Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {v14, v0, v1, v2}, Lio/sentry/android/core/u;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, Lio/sentry/android/core/v;->start()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_1
    :goto_0
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 103
    .line 104
    const-string v1, "App start profiling was not sampled. It will not start."

    .line 105
    .line 106
    new-array v2, v4, [Ljava/lang/Object;

    .line 107
    .line 108
    invoke-virtual {v14, v0, v1, v2}, Lio/sentry/android/core/u;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onCreate()Z
    .locals 8

    .line 1
    invoke-static {p0}, Lio/sentry/android/core/performance/g;->d(Landroid/content/ContentProvider;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 13
    .line 14
    sget-wide v3, Lio/sentry/android/core/SentryPerformanceProvider;->e:J

    .line 15
    .line 16
    invoke-virtual {v2, v3, v4}, Lio/sentry/android/core/performance/h;->f(J)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lio/sentry/android/core/SentryPerformanceProvider;->d:Lio/sentry/android/core/o0;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Process;->getStartUptimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v2, v3, v4}, Lio/sentry/android/core/performance/h;->f(J)V

    .line 31
    .line 32
    .line 33
    instance-of v2, v1, Landroid/app/Application;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    check-cast v1, Landroid/app/Application;

    .line 38
    .line 39
    iput-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->b:Landroid/app/Application;

    .line 40
    .line 41
    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->b:Landroid/app/Application;

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0, v1}, Lio/sentry/android/core/performance/g;->g(Landroid/app/Application;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/4 v2, 0x0

    .line 54
    iget-object v3, p0, Lio/sentry/android/core/SentryPerformanceProvider;->c:Lio/sentry/android/core/u;

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    sget-object v0, Lio/sentry/m5;->FATAL:Lio/sentry/m5;

    .line 59
    .line 60
    const-string v1, "App. Context from ContentProvider is null"

    .line 61
    .line 62
    new-array v2, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {v3, v0, v1, v2}, Lio/sentry/android/core/u;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_2
    new-instance v4, Ljava/io/File;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const-string v6, "sentry"

    .line 76
    .line 77
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v5, Ljava/io/File;

    .line 81
    .line 82
    const-string v6, "app_start_profiling_config"

    .line 83
    .line 84
    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_8

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/io/File;->canRead()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_3

    .line 98
    .line 99
    goto/16 :goto_6

    .line 100
    .line 101
    :cond_3
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    .line 102
    .line 103
    new-instance v6, Ljava/io/InputStreamReader;

    .line 104
    .line 105
    new-instance v7, Ljava/io/FileInputStream;

    .line 106
    .line 107
    invoke-direct {v7, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v6, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v4, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    .line 116
    :try_start_1
    new-instance v5, Lio/sentry/h2;

    .line 117
    .line 118
    invoke-static {}, Lio/sentry/m6;->empty()Lio/sentry/m6;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-direct {v5, v6}, Lio/sentry/h2;-><init>(Lio/sentry/m6;)V

    .line 123
    .line 124
    .line 125
    const-class v6, Lio/sentry/n4;

    .line 126
    .line 127
    invoke-virtual {v5, v4, v6}, Lio/sentry/h2;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    check-cast v5, Lio/sentry/n4;

    .line 132
    .line 133
    if-nez v5, :cond_5

    .line 134
    .line 135
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 136
    .line 137
    const-string v1, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start."

    .line 138
    .line 139
    new-array v2, v2, [Ljava/lang/Object;

    .line 140
    .line 141
    invoke-virtual {v3, v0, v1, v2}, Lio/sentry/android/core/u;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 142
    .line 143
    .line 144
    :cond_4
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    .line 146
    .line 147
    goto :goto_6

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    goto :goto_4

    .line 150
    :catch_0
    move-exception v0

    .line 151
    goto :goto_5

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    goto :goto_2

    .line 154
    :cond_5
    :try_start_3
    iget-boolean v6, v5, Lio/sentry/n4;->i:Z

    .line 155
    .line 156
    if-eqz v6, :cond_6

    .line 157
    .line 158
    iget-boolean v6, v5, Lio/sentry/n4;->V:Z

    .line 159
    .line 160
    if-eqz v6, :cond_6

    .line 161
    .line 162
    invoke-virtual {p0, v1, v5, v0}, Lio/sentry/android/core/SentryPerformanceProvider;->a(Landroid/content/Context;Lio/sentry/n4;Lio/sentry/android/core/performance/g;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_6
    iget-boolean v6, v5, Lio/sentry/n4;->f:Z

    .line 167
    .line 168
    if-nez v6, :cond_7

    .line 169
    .line 170
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 171
    .line 172
    const-string v1, "Profiling is not enabled. App start profiling will not start."

    .line 173
    .line 174
    new-array v2, v2, [Ljava/lang/Object;

    .line 175
    .line 176
    invoke-virtual {v3, v0, v1, v2}, Lio/sentry/android/core/u;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_7
    iget-boolean v2, v5, Lio/sentry/n4;->U:Z

    .line 181
    .line 182
    if-eqz v2, :cond_4

    .line 183
    .line 184
    invoke-virtual {p0, v1, v5, v0}, Lio/sentry/android/core/SentryPerformanceProvider;->b(Landroid/content/Context;Lio/sentry/n4;Lio/sentry/android/core/performance/g;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :goto_2
    :try_start_4
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :catchall_2
    move-exception v1

    .line 193
    :try_start_5
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    :goto_3
    throw v0
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 197
    :goto_4
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 198
    .line 199
    const-string v2, "Error reading app start profiling config file. "

    .line 200
    .line 201
    invoke-virtual {v3, v1, v2, v0}, Lio/sentry/android/core/u;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :goto_5
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 206
    .line 207
    const-string v2, "App start profiling config file not found. "

    .line 208
    .line 209
    invoke-virtual {v3, v1, v2, v0}, Lio/sentry/android/core/u;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    :cond_8
    :goto_6
    invoke-static {p0}, Lio/sentry/android/core/performance/g;->e(Landroid/content/ContentProvider;)V

    .line 213
    .line 214
    .line 215
    const/4 p0, 0x1

    .line 216
    return p0
.end method

.method public final shutdown()V
    .locals 2

    .line 1
    sget-object p0, Lio/sentry/android/core/performance/g;->l0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/sentry/android/core/v;->close()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Lio/sentry/android/core/h;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :catchall_1
    move-exception p0

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :goto_2
    throw v0
.end method
