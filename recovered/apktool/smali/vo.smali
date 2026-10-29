.class public final synthetic Lvo;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lvo;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lvo;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lvo;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lvo;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lvo;->e:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lvo;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lvo;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lvo;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lvo;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lvo;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Landroid/view/View;

    .line 15
    .line 16
    check-cast v3, Landroid/graphics/Canvas;

    .line 17
    .line 18
    check-cast v2, Lio/sentry/ILogger;

    .line 19
    .line 20
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    :try_start_1
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 31
    .line 32
    const-string v3, "Taking screenshot failed (view.draw)."

    .line 33
    .line 34
    invoke-interface {v2, v0, v3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    return-void

    .line 39
    :catchall_1
    move-exception p0

    .line 40
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :pswitch_0
    check-cast p0, Landroid/view/Window;

    .line 45
    .line 46
    check-cast v3, Landroid/view/Window$Callback;

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Runnable;

    .line 49
    .line 50
    check-cast v1, Lio/sentry/android/core/o0;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0, v3}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v2, v1}, Lio/sentry/android/core/internal/util/j;->b(Landroid/view/View;Ljava/lang/Runnable;Lio/sentry/android/core/o0;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void

    .line 65
    :pswitch_1
    check-cast p0, Lio/sentry/android/core/ScreenshotEventProcessor;

    .line 66
    .line 67
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 68
    .line 69
    check-cast v2, Landroid/app/Activity;

    .line 70
    .line 71
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 72
    .line 73
    :try_start_2
    invoke-virtual {p0, v2}, Lio/sentry/android/core/ScreenshotEventProcessor;->a(Landroid/app/Activity;)Lio/sentry/android/replay/viewhierarchy/h;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :catchall_2
    move-exception p0

    .line 85
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :pswitch_2
    check-cast p0, Lcom/appsflyer/internal/AFj1sSDK;

    .line 90
    .line 91
    check-cast v3, Landroid/content/Context;

    .line 92
    .line 93
    check-cast v2, Ljava/lang/Runnable;

    .line 94
    .line 95
    check-cast v1, Lcom/appsflyer/internal/AFd1zSDK;

    .line 96
    .line 97
    invoke-static {p0, v3, v2, v1}, Lcom/appsflyer/internal/AFj1sSDK;->b(Lcom/appsflyer/internal/AFj1sSDK;Landroid/content/Context;Ljava/lang/Runnable;Lcom/appsflyer/internal/AFd1zSDK;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_3
    check-cast p0, Lhn;

    .line 102
    .line 103
    check-cast v3, Landroid/hardware/camera2/CameraCaptureSession;

    .line 104
    .line 105
    check-cast v2, Landroid/hardware/camera2/CaptureRequest;

    .line 106
    .line 107
    check-cast v1, Landroid/hardware/camera2/CaptureFailure;

    .line 108
    .line 109
    iget-object p0, p0, Lhn;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 112
    .line 113
    invoke-virtual {p0, v3, v2, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_4
    check-cast p0, Lhn;

    .line 118
    .line 119
    check-cast v3, Landroid/hardware/camera2/CameraCaptureSession;

    .line 120
    .line 121
    check-cast v2, Landroid/hardware/camera2/CaptureRequest;

    .line 122
    .line 123
    check-cast v1, Landroid/hardware/camera2/CaptureResult;

    .line 124
    .line 125
    iget-object p0, p0, Lhn;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 128
    .line 129
    invoke-virtual {p0, v3, v2, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureProgressed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_5
    check-cast p0, Lhn;

    .line 134
    .line 135
    check-cast v3, Landroid/hardware/camera2/CameraCaptureSession;

    .line 136
    .line 137
    check-cast v2, Landroid/hardware/camera2/CaptureRequest;

    .line 138
    .line 139
    check-cast v1, Landroid/hardware/camera2/TotalCaptureResult;

    .line 140
    .line 141
    iget-object p0, p0, Lhn;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 144
    .line 145
    invoke-virtual {p0, v3, v2, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
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
