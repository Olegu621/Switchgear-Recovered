.class public final Lo92;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# instance fields
.field public a:Lio/flutter/plugin/common/MethodChannel;

.field public b:Lio/flutter/plugin/common/EventChannel;

.field public c:Lio/flutter/plugin/common/EventChannel;

.field public d:Lio/flutter/plugin/common/EventChannel;

.field public e:Lio/flutter/plugin/common/EventChannel;

.field public f:Ljh2;

.field public i:Ljh2;

.field public v:Ljh2;

.field public w:Ljh2;


# virtual methods
.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lio/flutter/plugin/common/MethodChannel;

    .line 12
    .line 13
    const-string v2, "dev.fluttercommunity.plus/sensors/method"

    .line 14
    .line 15
    invoke-direct {v1, v0, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lo92;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 19
    .line 20
    new-instance v0, Lx6;

    .line 21
    .line 22
    const/16 v2, 0xe

    .line 23
    .line 24
    invoke-direct {v0, p0, v2}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-string v1, "sensor"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast v0, Landroid/hardware/SensorManager;

    .line 54
    .line 55
    new-instance v1, Lio/flutter/plugin/common/EventChannel;

    .line 56
    .line 57
    const-string v2, "dev.fluttercommunity.plus/sensors/accelerometer"

    .line 58
    .line 59
    invoke-direct {v1, p1, v2}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lo92;->b:Lio/flutter/plugin/common/EventChannel;

    .line 63
    .line 64
    new-instance v2, Ljh2;

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    invoke-direct {v2, v0, v3}, Ljh2;-><init>(Landroid/hardware/SensorManager;I)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lo92;->f:Ljh2;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lio/flutter/plugin/common/EventChannel;

    .line 76
    .line 77
    const-string v2, "dev.fluttercommunity.plus/sensors/user_accel"

    .line 78
    .line 79
    invoke-direct {v1, p1, v2}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lo92;->c:Lio/flutter/plugin/common/EventChannel;

    .line 83
    .line 84
    new-instance v2, Ljh2;

    .line 85
    .line 86
    const/16 v3, 0xa

    .line 87
    .line 88
    invoke-direct {v2, v0, v3}, Ljh2;-><init>(Landroid/hardware/SensorManager;I)V

    .line 89
    .line 90
    .line 91
    iput-object v2, p0, Lo92;->i:Ljh2;

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lio/flutter/plugin/common/EventChannel;

    .line 97
    .line 98
    const-string v2, "dev.fluttercommunity.plus/sensors/gyroscope"

    .line 99
    .line 100
    invoke-direct {v1, p1, v2}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iput-object v1, p0, Lo92;->d:Lio/flutter/plugin/common/EventChannel;

    .line 104
    .line 105
    new-instance v2, Ljh2;

    .line 106
    .line 107
    const/4 v3, 0x4

    .line 108
    invoke-direct {v2, v0, v3}, Ljh2;-><init>(Landroid/hardware/SensorManager;I)V

    .line 109
    .line 110
    .line 111
    iput-object v2, p0, Lo92;->v:Ljh2;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 114
    .line 115
    .line 116
    new-instance v1, Lio/flutter/plugin/common/EventChannel;

    .line 117
    .line 118
    const-string v2, "dev.fluttercommunity.plus/sensors/magnetometer"

    .line 119
    .line 120
    invoke-direct {v1, p1, v2}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Lo92;->e:Lio/flutter/plugin/common/EventChannel;

    .line 124
    .line 125
    new-instance p1, Ljh2;

    .line 126
    .line 127
    const/4 v2, 0x2

    .line 128
    invoke-direct {p1, v0, v2}, Ljh2;-><init>(Landroid/hardware/SensorManager;I)V

    .line 129
    .line 130
    .line 131
    iput-object p1, p0, Lo92;->w:Ljh2;

    .line 132
    .line 133
    invoke-virtual {v1, p1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lo92;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_8

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lo92;->b:Lio/flutter/plugin/common/EventChannel;

    .line 13
    .line 14
    if-eqz p1, :cond_7

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lo92;->c:Lio/flutter/plugin/common/EventChannel;

    .line 20
    .line 21
    if-eqz p1, :cond_6

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lo92;->d:Lio/flutter/plugin/common/EventChannel;

    .line 27
    .line 28
    if-eqz p1, :cond_5

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lo92;->e:Lio/flutter/plugin/common/EventChannel;

    .line 34
    .line 35
    if-eqz p1, :cond_4

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lo92;->f:Ljh2;

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljh2;->onCancel(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lo92;->i:Ljh2;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljh2;->onCancel(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lo92;->v:Ljh2;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljh2;->onCancel(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lo92;->w:Ljh2;

    .line 62
    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljh2;->onCancel(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    const-string p0, "magnetometerStreamHandler"

    .line 70
    .line 71
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_1
    const-string p0, "gyroscopeStreamHandler"

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    const-string p0, "userAccelStreamHandler"

    .line 82
    .line 83
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_3
    const-string p0, "accelerometerStreamHandler"

    .line 88
    .line 89
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_4
    const-string p0, "magnetometerChannel"

    .line 94
    .line 95
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :cond_5
    const-string p0, "gyroscopeChannel"

    .line 100
    .line 101
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_6
    const-string p0, "userAccelChannel"

    .line 106
    .line 107
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_7
    const-string p0, "accelerometerChannel"

    .line 112
    .line 113
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_8
    const-string p0, "methodChannel"

    .line 118
    .line 119
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0
.end method
