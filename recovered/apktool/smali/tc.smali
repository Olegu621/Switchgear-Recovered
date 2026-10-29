.class public final Ltc;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/titan/GameApp;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/GameApp;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltc;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ltc;->b:Lcom/supercell/titan/GameApp;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ltc;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ltc;->b:Lcom/supercell/titan/GameApp;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/supercell/titan/GameApp;->handleResume(Z)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->setSystemUiVisibility()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->t0:Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Lcom/supercell/titan/VirtualKeyboardHandler;->getKeyboardSize(I)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, Lcom/supercell/titan/GameApp;->r0:F

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_2
    invoke-static {}, Lcom/supercell/titan/GameApp;->getAllowedScreenRotations()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    and-int/lit8 v2, v0, 0x1

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    and-int/lit8 v2, v0, 0x2

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v2, v1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    move v2, v3

    .line 58
    :goto_1
    and-int/lit8 v4, v0, 0x4

    .line 59
    .line 60
    if-nez v4, :cond_3

    .line 61
    .line 62
    and-int/lit8 v0, v0, 0x8

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    :cond_3
    move v1, v3

    .line 67
    :cond_4
    if-eqz v2, :cond_5

    .line 68
    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    const/4 v0, 0x7

    .line 72
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 73
    .line 74
    .line 75
    :cond_5
    if-eqz v1, :cond_6

    .line 76
    .line 77
    if-nez v2, :cond_6

    .line 78
    .line 79
    const/4 v0, 0x6

    .line 80
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 81
    .line 82
    .line 83
    :cond_6
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
