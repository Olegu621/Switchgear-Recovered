.class public Lcom/supercell/titan/AndroidScreenshotUtility;
.super Ljava/lang/Object;
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

.method public static a(Landroid/graphics/Bitmap$CompressFormat;II)[B
    .locals 10

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/supercell/titan/GameApp;->getView()Lcom/supercell/titan/GL2JNISurfaceView;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v9, 0x0

    .line 18
    if-lez v0, :cond_2

    .line 19
    .line 20
    if-gtz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x1

    .line 28
    if-lez p2, :cond_1

    .line 29
    .line 30
    if-le v3, p2, :cond_1

    .line 31
    .line 32
    int-to-double v5, p2

    .line 33
    int-to-double v7, v3

    .line 34
    div-double/2addr v5, v7

    .line 35
    int-to-double v7, v0

    .line 36
    mul-double/2addr v7, v5

    .line 37
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 38
    .line 39
    .line 40
    move-result-wide v7

    .line 41
    long-to-int p2, v7

    .line 42
    invoke-static {v4, p2}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    int-to-double v7, v1

    .line 47
    mul-double/2addr v7, v5

    .line 48
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    long-to-int p2, v5

    .line 53
    invoke-static {v4, p2}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    :cond_1
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 58
    .line 59
    invoke-static {v0, v1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v8, Ljava/util/concurrent/CountDownLatch;

    .line 64
    .line 65
    invoke-direct {v8, v4}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-array v6, v4, [[B

    .line 69
    .line 70
    new-array v7, v4, [Z

    .line 71
    .line 72
    new-instance p2, Landroid/os/Handler;

    .line 73
    .line 74
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Lo8;

    .line 82
    .line 83
    move-object v4, p0

    .line 84
    move v5, p1

    .line 85
    invoke-direct/range {v1 .. v8}, Lo8;-><init>(Lcom/supercell/titan/GL2JNISurfaceView;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I[[B[ZLjava/util/concurrent/CountDownLatch;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 89
    .line 90
    .line 91
    :try_start_0
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 92
    .line 93
    const-wide/16 p1, 0x1388

    .line 94
    .line 95
    invoke-virtual {v8, p1, p2, p0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    :catch_0
    const/4 p0, 0x0

    .line 99
    aget-boolean p1, v7, p0

    .line 100
    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    aget-object v9, v6, p0

    .line 104
    .line 105
    :cond_2
    :goto_0
    return-object v9
.end method

.method public static takeScreenshotJPG(II)[B
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 2
    .line 3
    invoke-static {v0, p1, p0}, Lcom/supercell/titan/AndroidScreenshotUtility;->a(Landroid/graphics/Bitmap$CompressFormat;II)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static takeScreenshotPNG(II)[B
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 2
    .line 3
    invoke-static {v0, p1, p0}, Lcom/supercell/titan/AndroidScreenshotUtility;->a(Landroid/graphics/Bitmap$CompressFormat;II)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
