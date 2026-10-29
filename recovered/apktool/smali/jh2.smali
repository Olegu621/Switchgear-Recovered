.class public final Ljh2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field public final a:Landroid/hardware/SensorManager;

.field public final b:I

.field public c:Lih2;

.field public d:Landroid/hardware/Sensor;

.field public e:I


# direct methods
.method public constructor <init>(Landroid/hardware/SensorManager;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljh2;->a:Landroid/hardware/SensorManager;

    .line 5
    .line 6
    iput p2, p0, Ljh2;->b:I

    .line 7
    .line 8
    const p1, 0x30d40

    .line 9
    .line 10
    .line 11
    iput p1, p0, Ljh2;->e:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ljh2;->d:Landroid/hardware/Sensor;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ljh2;->a:Landroid/hardware/SensorManager;

    .line 6
    .line 7
    iget-object v0, p0, Ljh2;->c:Lih2;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Ljh2;->c:Lih2;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ljh2;->a:Landroid/hardware/SensorManager;

    .line 5
    .line 6
    iget v0, p0, Ljh2;->b:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Ljh2;->d:Landroid/hardware/Sensor;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Lih2;

    .line 17
    .line 18
    invoke-direct {v0, p2}, Lih2;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ljh2;->c:Lih2;

    .line 22
    .line 23
    iget p0, p0, Ljh2;->e:I

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, p0}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string p1, "It seems that your device has no "

    .line 32
    .line 33
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    if-eq v0, p1, :cond_4

    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    if-eq v0, p1, :cond_3

    .line 41
    .line 42
    const/4 p1, 0x4

    .line 43
    if-eq v0, p1, :cond_2

    .line 44
    .line 45
    const/16 p1, 0xa

    .line 46
    .line 47
    if-eq v0, p1, :cond_1

    .line 48
    .line 49
    const-string p1, "Undefined"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string p1, "User Accelerometer"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-string p1, "Gyroscope"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const-string p1, "Magnetometer"

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const-string p1, "Accelerometer"

    .line 62
    .line 63
    :goto_0
    const-string v0, " sensor"

    .line 64
    .line 65
    invoke-static {p0, p1, v0}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p1, "NO_SENSOR"

    .line 70
    .line 71
    const-string v0, "Sensor not found"

    .line 72
    .line 73
    invoke-interface {p2, p1, v0, p0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
