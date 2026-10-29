.class public Lcom/supercell/titan/TitanApplication;
.super Lxhpgvfjuz/o;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static b:Lcom/supercell/titan/TitanApplication;

.field public static volatile c:Z

.field public static nativeBaseLibrariesLoaded:Z

.field public static nativeLibrariesLoaded:Z


# instance fields
.field public final a:Lcom/supercell/titan/BackgroundObserver;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxhpgvfjuz/o;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/supercell/titan/BackgroundObserver;

    .line 5
    .line 6
    new-instance v1, Lcom/supercell/titan/m;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/supercell/titan/BackgroundObserver;-><init>(Lcom/supercell/titan/BackgroundObserver$Listener;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/supercell/titan/TitanApplication;->a:Lcom/supercell/titan/BackgroundObserver;

    .line 15
    .line 16
    return-void
.end method

.method public static getAppContext()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/TitanApplication;->b:Lcom/supercell/titan/TitanApplication;

    .line 2
    .line 3
    return-object v0
.end method

.method public static isInForeground()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/TitanApplication;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public static nOnApplicationCreate()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnApplicationCreate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static native nOnNativeLibrariesLoaded()V
.end method


# virtual methods
.method public onCreate()V
    .locals 9

    .line 1
    sget-object v1, Lio/sentry/android/core/performance/g;->k0:Lio/sentry/android/core/performance/g;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, v3, Lio/sentry/android/core/performance/g;->f:Lio/sentry/android/core/performance/h;

    .line 12
    .line 13
    iget-wide v5, v4, Lio/sentry/android/core/performance/h;->c:J

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    cmp-long v5, v5, v7

    .line 18
    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    invoke-virtual {v4, v1, v2}, Lio/sentry/android/core/performance/h;->f(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p0}, Lio/sentry/android/core/performance/g;->g(Landroid/app/Application;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-super {p0}, Lxhpgvfjuz/o;->onCreate()V

    .line 28
    .line 29
    .line 30
    sput-object p0, Lcom/supercell/titan/TitanApplication;->b:Lcom/supercell/titan/TitanApplication;

    .line 31
    .line 32
    new-instance v1, Lf42;

    .line 33
    .line 34
    const/16 v2, 0xa

    .line 35
    .line 36
    invoke-direct {v1, v2}, Lf42;-><init>(I)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lio/sentry/android/core/u;

    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    invoke-direct {v2, v3}, Lio/sentry/android/core/u;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v2, v1}, Lio/sentry/android/core/i1;->b(Landroid/content/Context;Lio/sentry/android/core/u;Lio/sentry/l4;)V

    .line 46
    .line 47
    .line 48
    const v0, 0xb8

    const-string v1, "TitanApplication"

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    :try_start_0
    const v0, 0xb9

    const-string v3, "fmod"

    .line 52
    .line 53
    invoke-static {v3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    :goto_0
    move v3, v2

    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception v3

    .line 59
    :try_start_1
    const v0, 0xba

    const-string v4, "fmodL"

    .line 60
    .line 61
    invoke-static {v4}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_1
    move-exception v4

    .line 66
    const v0, 0xbb

    const-string v5, "UnsatisfiedLinkError loading fmod"

    .line 67
    .line 68
    invoke-static {v1, v5, v3}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    const v0, 0xbc

    const-string v3, "UnsatisfiedLinkError loading fmodL"

    .line 72
    .line 73
    invoke-static {v1, v3, v4}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    :goto_1
    if-eqz v3, :cond_1

    .line 78
    .line 79
    invoke-static {p0}, Lcom/supercell/titan/LibsSideload;->loadLibG(Landroid/content/Context;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_1

    .line 84
    .line 85
    :try_start_2
    const v0, 0xbd

    const-string v4, "g"

    .line 86
    .line 87
    invoke-static {v4}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_2

    .line 88
    .line 89
    .line 90
    move v3, v2

    .line 91
    goto :goto_2

    .line 92
    :catch_2
    move-exception v4

    .line 93
    const v0, 0xbe

    const-string v5, "UnsatisfiedLinkError libg"

    .line 94
    .line 95
    invoke-static {v1, v5, v4}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    .line 97
    .line 98
    :cond_1
    :goto_2
    if-eqz v3, :cond_2

    sput-boolean v2, Lcom/supercell/titan/TitanApplication;->nativeBaseLibrariesLoaded:Z

    :cond_2
    iget-object v1, p0, Lcom/supercell/titan/TitanApplication;->a:Lcom/supercell/titan/BackgroundObserver;

    .line 109
    .line 110
    invoke-virtual {p0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 111
    .line 112
    .line 113
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 114
    .line 115
    .line 116
    move-result-wide v1

    .line 117
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iget-object v3, v3, Lio/sentry/android/core/performance/g;->f:Lio/sentry/android/core/performance/h;

    .line 122
    .line 123
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->c()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_3

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    const v0, 0xbf

    const-string v4, ".onCreate"

    .line 138
    .line 139
    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iput-object p0, v3, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 144
    .line 145
    iput-wide v1, v3, Lio/sentry/android/core/performance/h;->d:J

    .line 146
    .line 147
    :cond_3
    return-void
.end method
