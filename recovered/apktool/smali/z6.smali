.class public final synthetic Lz6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lz6;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lz6;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lz6;->b:I

    .line 6
    .line 7
    iput-object p3, p0, Lz6;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 13
    iput p4, p0, Lz6;->a:I

    iput-object p1, p0, Lz6;->c:Ljava/lang/Object;

    iput-object p2, p0, Lz6;->d:Ljava/lang/Object;

    iput p3, p0, Lz6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lz6;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lz6;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lz6;->b:I

    .line 6
    .line 7
    iget-object p0, p0, Lz6;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lfm;

    .line 13
    .line 14
    iget-object p0, p0, Lfm;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lay1;

    .line 17
    .line 18
    invoke-interface {p0, v2, v1}, Lay1;->f(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p0, Lfe0;

    .line 23
    .line 24
    check-cast v1, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-interface {p0, v2, v1}, Lfe0;->onGreatestScrollPercentageIncreased(ILandroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    check-cast p0, Lqn;

    .line 31
    .line 32
    check-cast v1, Landroid/hardware/camera2/CameraDevice;

    .line 33
    .line 34
    iget-object p0, p0, Lqn;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 37
    .line 38
    invoke-virtual {p0, v1, v2}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onError(Landroid/hardware/camera2/CameraDevice;I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    check-cast p0, Lhn;

    .line 43
    .line 44
    check-cast v1, Landroid/hardware/camera2/CameraCaptureSession;

    .line 45
    .line 46
    iget-object p0, p0, Lhn;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 49
    .line 50
    invoke-virtual {p0, v1, v2}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureSequenceAborted(Landroid/hardware/camera2/CameraCaptureSession;I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_3
    check-cast p0, Lmo;

    .line 55
    .line 56
    check-cast v1, Lso;

    .line 57
    .line 58
    invoke-virtual {p0, v2, v1}, Lmo;->b(ILso;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_4
    check-cast p0, Lmo;

    .line 63
    .line 64
    check-cast v1, Lxt0;

    .line 65
    .line 66
    invoke-virtual {p0, v2, v1}, Lmo;->c(ILxt0;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_5
    check-cast p0, Lcom/supercell/titan/agesignals/AgeSignals;

    .line 71
    .line 72
    check-cast v1, Ler0;

    .line 73
    .line 74
    sget v0, Lcom/supercell/titan/agesignals/AgeSignals;->MAX_RETRIES:I

    .line 75
    .line 76
    invoke-virtual {p0, v1, v2}, Lcom/supercell/titan/agesignals/AgeSignals;->a(Ler0;I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
