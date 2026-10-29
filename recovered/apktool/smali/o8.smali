.class public final synthetic Lo8;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/GL2JNISurfaceView;

.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:Landroid/graphics/Bitmap$CompressFormat;

.field public final synthetic d:I

.field public final synthetic e:[[B

.field public final synthetic f:[Z

.field public final synthetic i:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/GL2JNISurfaceView;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I[[B[ZLjava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo8;->a:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 5
    .line 6
    iput-object p2, p0, Lo8;->b:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    iput-object p3, p0, Lo8;->c:Landroid/graphics/Bitmap$CompressFormat;

    .line 9
    .line 10
    iput p4, p0, Lo8;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lo8;->e:[[B

    .line 13
    .line 14
    iput-object p6, p0, Lo8;->f:[Z

    .line 15
    .line 16
    iput-object p7, p0, Lo8;->i:Ljava/util/concurrent/CountDownLatch;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    new-instance v0, Lp8;

    .line 2
    .line 3
    iget-object v1, p0, Lo8;->b:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget-object v2, p0, Lo8;->c:Landroid/graphics/Bitmap$CompressFormat;

    .line 6
    .line 7
    iget v3, p0, Lo8;->d:I

    .line 8
    .line 9
    iget-object v4, p0, Lo8;->e:[[B

    .line 10
    .line 11
    iget-object v5, p0, Lo8;->f:[Z

    .line 12
    .line 13
    iget-object v6, p0, Lo8;->i:Ljava/util/concurrent/CountDownLatch;

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lp8;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I[[B[ZLjava/util/concurrent/CountDownLatch;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lo8;->a:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 28
    .line 29
    invoke-static {p0, v1, v0, v2}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
