.class public final Lcom/quago/mobile/sdk/o0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final H:Lcom/quago/mobile/sdk/j0;


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:Lcom/quago/mobile/sdk/a1;

.field public E:Lcom/quago/mobile/sdk/a1;

.field public F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public G:Ljava/lang/String;

.field public a:Z

.field public b:J

.field public c:J

.field public d:Lcom/quago/mobile/sdk/QuagoSettings;

.field public final e:Lcom/quago/mobile/sdk/b1;

.field public final f:Lcom/quago/mobile/sdk/c1;

.field public final g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Lcom/quago/mobile/sdk/y0;

.field public o:Landroid/hardware/input/InputManager;

.field public p:Lcom/quago/mobile/sdk/t;

.field public q:Lcom/quago/mobile/sdk/e;

.field public r:Lcom/quago/mobile/sdk/i;

.field public s:Lcom/quago/mobile/sdk/p0;

.field public t:Lcom/quago/mobile/sdk/s0;

.field public u:Ljava/lang/ref/WeakReference;

.field public v:Landroid/os/HandlerThread;

.field public w:Lcom/quago/mobile/sdk/n0;

.field public x:Lcom/quago/mobile/sdk/g1;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 2
    .line 3
    new-instance v0, Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const-string v1, "QuagoManager"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/quago/mobile/sdk/o0;->b:J

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/quago/mobile/sdk/o0;->c:J

    .line 12
    .line 13
    new-instance v1, Lcom/quago/mobile/sdk/b1;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/quago/mobile/sdk/b1;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/quago/mobile/sdk/o0;->e:Lcom/quago/mobile/sdk/b1;

    .line 19
    .line 20
    new-instance v1, Lcom/quago/mobile/sdk/c1;

    .line 21
    .line 22
    invoke-direct {v1}, Lcom/quago/mobile/sdk/c1;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 26
    .line 27
    iput v0, p0, Lcom/quago/mobile/sdk/o0;->h:I

    .line 28
    .line 29
    iput v0, p0, Lcom/quago/mobile/sdk/o0;->i:I

    .line 30
    .line 31
    iput v0, p0, Lcom/quago/mobile/sdk/o0;->j:I

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/quago/mobile/sdk/o0;->y:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/quago/mobile/sdk/o0;->z:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/quago/mobile/sdk/o0;->g:Ljava/lang/String;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 11

    .line 643
    iget-boolean v0, p0, Lcom/quago/mobile/sdk/o0;->a:Z

    if-eqz v0, :cond_4

    if-nez p1, :cond_0

    goto/16 :goto_7

    .line 644
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const/high16 v1, -0x40800000    # -1.0f

    const/4 v10, 0x0

    const/4 v4, -0x1

    .line 645
    :try_start_0
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 646
    const-string v5, "window"

    invoke-virtual {p1, v5}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 647
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 648
    iget p1, v0, Landroid/util/DisplayMetrics;->widthPixels:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 649
    :try_start_1
    iget v5, v0, Landroid/util/DisplayMetrics;->heightPixels:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 650
    :try_start_2
    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v10, v10}, Landroid/graphics/Point;-><init>(II)V

    .line 651
    iget-object v7, p0, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/app/Application;

    if-nez v7, :cond_1

    .line 652
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    const-string v6, "checkResolutionChange"

    const-string v7, "application is null!"

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v6, v7, v8}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    move v7, v4

    move v6, v5

    move v5, v1

    goto :goto_3

    .line 653
    :cond_1
    const-string v8, "window"

    invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/WindowManager;

    .line 654
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    .line 655
    invoke-virtual {v7, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 656
    iget v8, v0, Landroid/util/DisplayMetrics;->xdpi:F
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 657
    :try_start_3
    iget v1, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 658
    invoke-virtual {v7, v6}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 659
    iget v7, v6, Landroid/graphics/Point;->x:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 660
    :try_start_4
    iget v4, v6, Landroid/graphics/Point;->y:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move v6, v5

    move v9, v1

    :goto_0
    move v5, v4

    move v4, v7

    move v7, v6

    move v6, p1

    goto :goto_4

    :catch_1
    move-exception v0

    :goto_1
    move v6, v5

    move v5, v1

    move v1, v8

    goto :goto_3

    :catch_2
    move-exception v0

    move v7, v4

    goto :goto_1

    :catch_3
    move-exception v0

    move v5, v1

    move v6, v4

    :goto_2
    move v7, v6

    goto :goto_3

    :catch_4
    move-exception v0

    move v5, v1

    move p1, v4

    move v6, p1

    goto :goto_2

    .line 661
    :goto_3
    sget-object v8, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    const-string v9, "checkResolutionChange"

    invoke-virtual {v8, v9, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v8, v1

    move v9, v5

    goto :goto_0

    .line 662
    :goto_4
    new-instance v1, Lcom/quago/mobile/sdk/g1;

    invoke-direct/range {v1 .. v9}, Lcom/quago/mobile/sdk/g1;-><init>(JIIIIFF)V

    .line 663
    sget-object p1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    invoke-virtual {v1}, Lcom/quago/mobile/sdk/g1;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    const-string v3, "checkResolutionChange"

    invoke-virtual {p1, v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    iget-object p1, p0, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    invoke-virtual {v1, p1}, Lcom/quago/mobile/sdk/g1;->b(Lcom/quago/mobile/sdk/j;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_7

    .line 665
    :cond_2
    iput-object v1, p0, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 666
    iget-object p0, p0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 667
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->o:Lcom/quago/mobile/sdk/k;

    .line 668
    iget v0, p1, Lcom/quago/mobile/sdk/k;->c:I

    add-int/lit8 v0, v0, 0x1

    iget-object p1, p1, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast p1, [Lcom/quago/mobile/sdk/g1;

    array-length v2, p1

    rem-int/2addr v0, v2

    .line 669
    aget-object p1, p1, v0

    monitor-enter p1

    .line 670
    :try_start_5
    iget-object v2, p0, Lcom/quago/mobile/sdk/i;->o:Lcom/quago/mobile/sdk/k;

    iget-object v2, v2, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v2, [Lcom/quago/mobile/sdk/g1;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Lcom/quago/mobile/sdk/g1;->a(Lcom/quago/mobile/sdk/j;)V

    .line 671
    iget-object v1, p0, Lcom/quago/mobile/sdk/i;->o:Lcom/quago/mobile/sdk/k;

    iput v0, v1, Lcom/quago/mobile/sdk/k;->c:I

    .line 672
    sget-object v1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    sget-object v2, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 673
    iget v1, v1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    invoke-static {v1}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 674
    iget-object v1, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string v2, "onResolutionChange"

    const-string v3, "%s%s(%s)"

    iget-object v4, p0, Lcom/quago/mobile/sdk/i;->o:Lcom/quago/mobile/sdk/k;

    iget-object v5, v4, Lcom/quago/mobile/sdk/k;->b:Ljava/lang/String;

    iget-object v4, v4, Lcom/quago/mobile/sdk/k;->d:[Ljava/lang/Object;

    check-cast v4, [Lcom/quago/mobile/sdk/g1;

    aget-object v0, v4, v0

    .line 675
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/g1;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->o:Lcom/quago/mobile/sdk/k;

    iget p0, p0, Lcom/quago/mobile/sdk/k;->c:I

    .line 676
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v5, v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 677
    invoke-virtual {v1, v2, v3, p0}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_6

    .line 678
    :cond_3
    :goto_5
    monitor-exit p1

    goto :goto_7

    :goto_6
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p0

    :cond_4
    :goto_7
    return-void
.end method

.method public final declared-synchronized a(Landroid/app/Activity;Landroid/app/Application;Lcom/quago/mobile/sdk/QuagoSettings;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-boolean v0, v1, Lcom/quago/mobile/sdk/o0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :cond_0
    if-eqz v3, :cond_12

    .line 15
    .line 16
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    iput-wide v4, v1, Lcom/quago/mobile/sdk/o0;->B:J

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    iput-wide v4, v1, Lcom/quago/mobile/sdk/o0;->C:J

    .line 27
    .line 28
    iput-object v3, v1, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->isForceActivateAllSensors()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v4, 0x1

    .line 42
    const/4 v5, 0x0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 46
    .line 47
    new-array v6, v5, [Ljava/lang/Object;

    .line 48
    .line 49
    const-string v7, "QuagoManager"

    .line 50
    .line 51
    const-string v8, "isForceActivateAllSensors = true"

    .line 52
    .line 53
    invoke-virtual {v0, v7, v8, v6}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v9, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 57
    .line 58
    sget-object v10, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 59
    .line 60
    sget-object v11, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 61
    .line 62
    sget-object v12, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 63
    .line 64
    sget-object v13, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 65
    .line 66
    sget-object v14, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 67
    .line 68
    sget-object v15, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 69
    .line 70
    sget-object v16, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 71
    .line 72
    sget-object v17, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 73
    .line 74
    sget-object v18, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 75
    .line 76
    filled-new-array/range {v9 .. v18}, [Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_b

    .line 85
    .line 86
    :cond_1
    new-instance v0, Ljava/security/SecureRandom;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 89
    .line 90
    .line 91
    const/16 v6, 0x64

    .line 92
    .line 93
    invoke-virtual {v0, v6}, Ljava/util/Random;->nextInt(I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    add-int/2addr v0, v4

    .line 98
    sget-object v6, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    const-string v8, "QuagoManager"

    .line 109
    .line 110
    const-string v9, "Value = %s"

    .line 111
    .line 112
    invoke-virtual {v6, v8, v9, v7}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    const/16 v6, 0x5a

    .line 116
    .line 117
    if-gt v0, v6, :cond_2

    .line 118
    .line 119
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 120
    .line 121
    sget-object v6, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 122
    .line 123
    filled-new-array {v0, v6}, [Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    sget-object v6, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 131
    .line 132
    sget-object v7, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 133
    .line 134
    sget-object v8, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 135
    .line 136
    sget-object v9, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 137
    .line 138
    sget-object v10, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 139
    .line 140
    sget-object v11, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 141
    .line 142
    sget-object v12, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 143
    .line 144
    sget-object v13, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 145
    .line 146
    sget-object v14, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 147
    .line 148
    sget-object v15, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 149
    .line 150
    filled-new-array/range {v6 .. v15}, [Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    .line 156
    :goto_0
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x6

    .line 158
    :try_start_2
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->y:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v8, v1, Lcom/quago/mobile/sdk/o0;->y:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, v8, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 175
    .line 176
    const/16 v9, 0x1c

    .line 177
    .line 178
    if-ge v8, v9, :cond_3

    .line 179
    .line 180
    iget-object v8, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 181
    .line 182
    iput-object v8, v1, Lcom/quago/mobile/sdk/o0;->z:Ljava/lang/String;

    .line 183
    .line 184
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 185
    .line 186
    int-to-long v8, v0

    .line 187
    iput-wide v8, v1, Lcom/quago/mobile/sdk/o0;->A:J

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :catch_0
    move-exception v0

    .line 191
    move-object v12, v0

    .line 192
    goto :goto_1

    .line 193
    :cond_3
    invoke-static {v0}, Lcom/appsflyer/internal/q;->a(Landroid/content/pm/PackageInfo;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v8

    .line 197
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    iput-object v8, v1, Lcom/quago/mobile/sdk/o0;->z:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v0}, Lrt1;->b(Landroid/content/pm/PackageInfo;)J

    .line 204
    .line 205
    .line 206
    move-result-wide v8

    .line 207
    iput-wide v8, v1, Lcom/quago/mobile/sdk/o0;->A:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :goto_1
    :try_start_3
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->y:Ljava/lang/String;

    .line 211
    .line 212
    if-nez v0, :cond_5

    .line 213
    .line 214
    sget-object v8, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 215
    .line 216
    const-string v11, "Application name can\'t be obtained."

    .line 217
    .line 218
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    const-string v10, "initialize"

    .line 222
    .line 223
    invoke-static {v7}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_4

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_4
    new-array v13, v5, [Ljava/lang/Object;

    .line 231
    .line 232
    const/4 v9, 0x6

    .line 233
    invoke-virtual/range {v8 .. v13}, Lcom/quago/mobile/sdk/j0;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_5
    sget-object v8, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 238
    .line 239
    const-string v11, "Application version can\'t be obtained."

    .line 240
    .line 241
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    const-string v10, "initialize"

    .line 245
    .line 246
    invoke-static {v7}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_6

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_6
    new-array v13, v5, [Ljava/lang/Object;

    .line 254
    .line 255
    const/4 v9, 0x6

    .line 256
    invoke-virtual/range {v8 .. v13}, Lcom/quago/mobile/sdk/j0;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :goto_2
    iput-object v6, v1, Lcom/quago/mobile/sdk/o0;->z:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 260
    .line 261
    :goto_3
    :try_start_4
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :catch_1
    move-exception v0

    .line 269
    move-object v12, v0

    .line 270
    :try_start_5
    sget-object v8, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 271
    .line 272
    const-string v11, "Application name can\'t be obtained."

    .line 273
    .line 274
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    const-string v10, "initialize"

    .line 278
    .line 279
    invoke-static {v7}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_7

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_7
    new-array v13, v5, [Ljava/lang/Object;

    .line 287
    .line 288
    const/4 v9, 0x6

    .line 289
    invoke-virtual/range {v8 .. v13}, Lcom/quago/mobile/sdk/j0;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :goto_4
    new-instance v0, Lcom/quago/mobile/sdk/p0;

    .line 293
    .line 294
    invoke-direct {v0, v2}, Lcom/quago/mobile/sdk/p0;-><init>(Landroid/content/Context;)V

    .line 295
    .line 296
    .line 297
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 298
    .line 299
    new-instance v0, Lcom/quago/mobile/sdk/e;

    .line 300
    .line 301
    invoke-direct {v0}, Lcom/quago/mobile/sdk/e;-><init>()V

    .line 302
    .line 303
    .line 304
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->q:Lcom/quago/mobile/sdk/e;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 305
    .line 306
    :try_start_6
    const-string v0, "sensor"

    .line 307
    .line 308
    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, Landroid/hardware/SensorManager;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 313
    .line 314
    :try_start_7
    iget-object v8, v1, Lcom/quago/mobile/sdk/o0;->q:Lcom/quago/mobile/sdk/e;

    .line 315
    .line 316
    invoke-virtual {v8, v2, v0, v1}, Lcom/quago/mobile/sdk/e;->a(Landroid/content/Context;Landroid/hardware/SensorManager;Lcom/quago/mobile/sdk/o0;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 317
    .line 318
    .line 319
    goto :goto_5

    .line 320
    :catch_2
    move-exception v0

    .line 321
    move-object v12, v0

    .line 322
    :try_start_8
    sget-object v8, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 323
    .line 324
    const-string v11, "Failed to Initialize BiometricSensoryManager."

    .line 325
    .line 326
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    const-string v10, "initialize"

    .line 330
    .line 331
    invoke-static {v7}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-nez v0, :cond_8

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_8
    new-array v13, v5, [Ljava/lang/Object;

    .line 339
    .line 340
    const/4 v9, 0x6

    .line 341
    invoke-virtual/range {v8 .. v13}, Lcom/quago/mobile/sdk/j0;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :catch_3
    move-exception v0

    .line 346
    move-object v12, v0

    .line 347
    :try_start_9
    sget-object v8, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 348
    .line 349
    const-string v11, "Failed to get Sensor Service from System."

    .line 350
    .line 351
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    const-string v10, "initialize"

    .line 355
    .line 356
    invoke-static {v7}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-nez v0, :cond_9

    .line 361
    .line 362
    goto :goto_5

    .line 363
    :cond_9
    new-array v13, v5, [Ljava/lang/Object;

    .line 364
    .line 365
    const/4 v9, 0x6

    .line 366
    invoke-virtual/range {v8 .. v13}, Lcom/quago/mobile/sdk/j0;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :goto_5
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->v:Landroid/os/HandlerThread;

    .line 370
    .line 371
    iget-object v7, v1, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 372
    .line 373
    new-instance v8, Landroid/os/HandlerThread;

    .line 374
    .line 375
    const-string v9, "QuagoManager"

    .line 376
    .line 377
    const/16 v10, 0xa

    .line 378
    .line 379
    invoke-direct {v8, v9, v10}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 380
    .line 381
    .line 382
    iput-object v8, v1, Lcom/quago/mobile/sdk/o0;->v:Landroid/os/HandlerThread;

    .line 383
    .line 384
    new-instance v9, Lcom/quago/mobile/sdk/l0;

    .line 385
    .line 386
    invoke-direct {v9}, Lcom/quago/mobile/sdk/l0;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v8, v9}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 390
    .line 391
    .line 392
    iget-object v8, v1, Lcom/quago/mobile/sdk/o0;->v:Landroid/os/HandlerThread;

    .line 393
    .line 394
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 395
    .line 396
    .line 397
    iget-object v8, v1, Lcom/quago/mobile/sdk/o0;->v:Landroid/os/HandlerThread;

    .line 398
    .line 399
    invoke-virtual {v8}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    new-instance v9, Lcom/quago/mobile/sdk/n0;

    .line 404
    .line 405
    invoke-direct {v9, v8, v1}, Lcom/quago/mobile/sdk/n0;-><init>(Landroid/os/Looper;Lcom/quago/mobile/sdk/o0;)V

    .line 406
    .line 407
    .line 408
    iput-object v9, v1, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 409
    .line 410
    if-eqz v7, :cond_a

    .line 411
    .line 412
    invoke-virtual {v7, v6}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    :cond_a
    if-eqz v0, :cond_b

    .line 416
    .line 417
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 418
    .line 419
    .line 420
    :cond_b
    :try_start_a
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->p:Lcom/quago/mobile/sdk/t;

    .line 421
    .line 422
    if-eqz v0, :cond_d

    .line 423
    .line 424
    iget-object v7, v1, Lcom/quago/mobile/sdk/o0;->o:Landroid/hardware/input/InputManager;

    .line 425
    .line 426
    if-eqz v7, :cond_c

    .line 427
    .line 428
    invoke-virtual {v7, v0}, Landroid/hardware/input/InputManager;->unregisterInputDeviceListener(Landroid/hardware/input/InputManager$InputDeviceListener;)V

    .line 429
    .line 430
    .line 431
    goto :goto_6

    .line 432
    :catch_4
    move-exception v0

    .line 433
    goto :goto_7

    .line 434
    :cond_c
    :goto_6
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->p:Lcom/quago/mobile/sdk/t;

    .line 435
    .line 436
    iget-object v0, v0, Lcom/quago/mobile/sdk/t;->c:Ljava/util/HashMap;

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 439
    .line 440
    .line 441
    :cond_d
    const-string v0, "input"

    .line 442
    .line 443
    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    check-cast v0, Landroid/hardware/input/InputManager;

    .line 448
    .line 449
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->o:Landroid/hardware/input/InputManager;

    .line 450
    .line 451
    new-instance v7, Lcom/quago/mobile/sdk/t;

    .line 452
    .line 453
    invoke-direct {v7, v0}, Lcom/quago/mobile/sdk/t;-><init>(Landroid/hardware/input/InputManager;)V

    .line 454
    .line 455
    .line 456
    iput-object v7, v1, Lcom/quago/mobile/sdk/o0;->p:Lcom/quago/mobile/sdk/t;

    .line 457
    .line 458
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->o:Landroid/hardware/input/InputManager;

    .line 459
    .line 460
    iget-object v8, v1, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 461
    .line 462
    invoke-virtual {v0, v7, v8}, Landroid/hardware/input/InputManager;->registerInputDeviceListener(Landroid/hardware/input/InputManager$InputDeviceListener;Landroid/os/Handler;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 463
    .line 464
    .line 465
    goto :goto_8

    .line 466
    :goto_7
    :try_start_b
    iput-object v6, v1, Lcom/quago/mobile/sdk/o0;->o:Landroid/hardware/input/InputManager;

    .line 467
    .line 468
    iput-object v6, v1, Lcom/quago/mobile/sdk/o0;->p:Lcom/quago/mobile/sdk/t;

    .line 469
    .line 470
    sget-object v7, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 471
    .line 472
    const-string v8, "init"

    .line 473
    .line 474
    invoke-virtual {v7, v8, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 475
    .line 476
    .line 477
    :goto_8
    new-instance v0, Lcom/quago/mobile/sdk/s0;

    .line 478
    .line 479
    new-instance v7, Lcom/quago/mobile/sdk/w0;

    .line 480
    .line 481
    invoke-direct {v7}, Lcom/quago/mobile/sdk/w0;-><init>()V

    .line 482
    .line 483
    .line 484
    const-string v8, "https://api.quago.io/v1/record"

    .line 485
    .line 486
    iput-object v8, v7, Lcom/quago/mobile/sdk/w0;->a:Ljava/lang/String;

    .line 487
    .line 488
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getTokenCallback()Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    if-nez v8, :cond_e

    .line 493
    .line 494
    goto :goto_9

    .line 495
    :cond_e
    iput-object v8, v7, Lcom/quago/mobile/sdk/w0;->h:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 496
    .line 497
    :goto_9
    new-instance v8, Lcom/quago/mobile/sdk/x0;

    .line 498
    .line 499
    invoke-direct {v8, v7}, Lcom/quago/mobile/sdk/x0;-><init>(Lcom/quago/mobile/sdk/w0;)V

    .line 500
    .line 501
    .line 502
    invoke-direct {v0, v8}, Lcom/quago/mobile/sdk/s0;-><init>(Lcom/quago/mobile/sdk/x0;)V

    .line 503
    .line 504
    .line 505
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->t:Lcom/quago/mobile/sdk/s0;

    .line 506
    .line 507
    new-instance v0, Lcom/quago/mobile/sdk/i;

    .line 508
    .line 509
    iget-object v7, v1, Lcom/quago/mobile/sdk/o0;->q:Lcom/quago/mobile/sdk/e;

    .line 510
    .line 511
    iget-object v8, v1, Lcom/quago/mobile/sdk/o0;->p:Lcom/quago/mobile/sdk/t;

    .line 512
    .line 513
    invoke-direct {v0, v7, v8, v3}, Lcom/quago/mobile/sdk/i;-><init>(Lcom/quago/mobile/sdk/e;Lcom/quago/mobile/sdk/t;Lcom/quago/mobile/sdk/QuagoSettings;)V

    .line 514
    .line 515
    .line 516
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 517
    .line 518
    new-instance v0, Lcom/quago/mobile/sdk/y0;

    .line 519
    .line 520
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-direct {v0, v2}, Lcom/quago/mobile/sdk/y0;-><init>(Landroid/content/Context;)V

    .line 525
    .line 526
    .line 527
    iput-object v0, v1, Lcom/quago/mobile/sdk/o0;->n:Lcom/quago/mobile/sdk/y0;

    .line 528
    .line 529
    iput-object v6, v1, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 530
    .line 531
    iput-boolean v4, v1, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 532
    .line 533
    invoke-virtual/range {p0 .. p1}, Lcom/quago/mobile/sdk/o0;->a(Landroid/app/Activity;)V

    .line 534
    .line 535
    .line 536
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 537
    .line 538
    if-eqz v0, :cond_f

    .line 539
    .line 540
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->q:Lcom/quago/mobile/sdk/e;

    .line 541
    .line 542
    iget-object v2, v1, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 543
    .line 544
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    check-cast v2, Landroid/content/Context;

    .line 549
    .line 550
    iget-object v6, v1, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 551
    .line 552
    invoke-virtual {v0, v2, v6}, Lcom/quago/mobile/sdk/e;->a(Landroid/content/Context;[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)V

    .line 553
    .line 554
    .line 555
    :cond_f
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 556
    .line 557
    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 558
    .line 559
    .line 560
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->isInitSegmentDisabled()Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-nez v0, :cond_11

    .line 565
    .line 566
    iget-boolean v0, v1, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 567
    .line 568
    if-nez v0, :cond_10

    .line 569
    .line 570
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 571
    .line 572
    new-array v2, v5, [Ljava/lang/Object;

    .line 573
    .line 574
    const-string v3, "beginInitSegment"

    .line 575
    .line 576
    const-string v4, "Method called before SDK initialized!"

    .line 577
    .line 578
    invoke-virtual {v0, v3, v4, v2}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    goto :goto_a

    .line 582
    :cond_10
    new-instance v5, Lcom/quago/mobile/sdk/a1;

    .line 583
    .line 584
    const-string v6, "INIT"

    .line 585
    .line 586
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 587
    .line 588
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v8

    .line 592
    iget-object v9, v1, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 593
    .line 594
    new-instance v10, Lcom/quago/mobile/sdk/g1;

    .line 595
    .line 596
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 597
    .line 598
    invoke-direct {v10, v0}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 599
    .line 600
    .line 601
    const/4 v7, 0x0

    .line 602
    invoke-direct/range {v5 .. v10}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 603
    .line 604
    .line 605
    iput-boolean v4, v5, Lcom/quago/mobile/sdk/a1;->n:Z

    .line 606
    .line 607
    iget-object v0, v1, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 608
    .line 609
    const/16 v2, 0xe

    .line 610
    .line 611
    invoke-static {v0, v2, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 616
    .line 617
    .line 618
    :cond_11
    :goto_a
    monitor-exit p0

    .line 619
    return-void

    .line 620
    :cond_12
    :try_start_c
    new-instance v0, Ljava/lang/NullPointerException;

    .line 621
    .line 622
    const-string v2, "settings is null"

    .line 623
    .line 624
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    throw v0

    .line 628
    :goto_b
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 629
    throw v0
.end method

.method public final a(Landroid/hardware/SensorEvent;)V
    .locals 5

    .line 630
    iget-boolean v0, p0, Lcom/quago/mobile/sdk/o0;->a:Z

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    if-eqz p1, :cond_b

    .line 631
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    if-eqz v0, :cond_b

    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    if-nez v1, :cond_1

    goto/16 :goto_1

    .line 632
    :cond_1
    iget-object p0, p0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_a

    if-eq v0, v1, :cond_9

    const/16 v4, 0x8

    if-eq v0, v4, :cond_8

    const/16 v4, 0xd

    if-eq v0, v4, :cond_7

    const/16 v4, 0x12

    if-eq v0, v4, :cond_6

    const/16 v4, 0x14

    if-eq v0, v4, :cond_5

    const/4 v4, 0x4

    if-eq v0, v4, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    goto :goto_1

    .line 633
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->k:Lcom/quago/mobile/sdk/k;

    aget p1, p1, v3

    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;F)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    .line 634
    :cond_3
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->j:Lcom/quago/mobile/sdk/k;

    aget p1, p1, v3

    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;F)V

    return-void

    .line 635
    :cond_4
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->g:Lcom/quago/mobile/sdk/k;

    aget v3, p1, v3

    aget v2, p1, v2

    aget p1, p1, v1

    invoke-virtual {p0, v0, v3, v2, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;FFF)V

    return-void

    .line 636
    :cond_5
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->h:Lcom/quago/mobile/sdk/k;

    aget v3, p1, v3

    aget v2, p1, v2

    aget p1, p1, v1

    invoke-virtual {p0, v0, v3, v2, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;FFF)V

    return-void

    .line 637
    :cond_6
    iget-object p1, p0, Lcom/quago/mobile/sdk/i;->n:Lcom/quago/mobile/sdk/k;

    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;)V

    return-void

    .line 638
    :cond_7
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->l:Lcom/quago/mobile/sdk/k;

    aget p1, p1, v3

    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;F)V

    return-void

    .line 639
    :cond_8
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->i:Lcom/quago/mobile/sdk/k;

    aget p1, p1, v3

    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;F)V

    return-void

    .line 640
    :cond_9
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->f:Lcom/quago/mobile/sdk/k;

    aget v3, p1, v3

    aget v2, p1, v2

    aget p1, p1, v1

    invoke-virtual {p0, v0, v3, v2, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;FFF)V

    return-void

    .line 641
    :cond_a
    iget-object v0, p0, Lcom/quago/mobile/sdk/i;->e:Lcom/quago/mobile/sdk/k;

    aget v3, p1, v3

    aget v2, p1, v2

    aget p1, p1, v1

    invoke-virtual {p0, v0, v3, v2, p1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;FFF)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 642
    :goto_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/i;->a:Lcom/quago/mobile/sdk/j0;

    const-string v0, "onSensorChanged"

    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    :goto_1
    return-void
.end method
