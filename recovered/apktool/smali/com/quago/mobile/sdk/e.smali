.class public final Lcom/quago/mobile/sdk/e;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final a:Lcom/quago/mobile/sdk/j0;

.field public b:Landroid/os/Handler;

.field public c:Lcom/quago/mobile/sdk/o0;

.field public d:Ljava/util/List;

.field public e:Landroid/content/Context;

.field public f:Landroid/os/HandlerThread;

.field public g:Landroid/hardware/SensorManager;

.field public final h:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "BiometricSensorsManager"

    .line 5
    .line 6
    invoke-static {v0}, Lcom/quago/mobile/sdk/k0;->a(Ljava/lang/String;)Lcom/quago/mobile/sdk/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/quago/mobile/sdk/e;->h:Ljava/util/HashMap;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/content/Context;Landroid/hardware/SensorManager;Lcom/quago/mobile/sdk/o0;)V
    .locals 0

    monitor-enter p0

    .line 158
    :try_start_0
    iput-object p1, p0, Lcom/quago/mobile/sdk/e;->e:Landroid/content/Context;

    .line 159
    iput-object p2, p0, Lcom/quago/mobile/sdk/e;->g:Landroid/hardware/SensorManager;

    .line 160
    iput-object p3, p0, Lcom/quago/mobile/sdk/e;->c:Lcom/quago/mobile/sdk/o0;

    const/4 p1, -0x1

    .line 161
    invoke-virtual {p2, p1}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/quago/mobile/sdk/e;->d:Ljava/util/List;

    .line 162
    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "BiometricsManager_Thread"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/quago/mobile/sdk/e;->f:Landroid/os/HandlerThread;

    .line 163
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 164
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Lcom/quago/mobile/sdk/e;->f:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/quago/mobile/sdk/e;->b:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 165
    :try_start_1
    iget-object p2, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    const-string p3, "init"

    invoke-virtual {p2, p3, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final varargs declared-synchronized a(Landroid/content/Context;[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    array-length v0, p2

    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_7

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    iget v3, v2, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->type:I

    .line 13
    .line 14
    const/4 v4, -0x1

    .line 15
    if-ne v3, v4, :cond_1

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_1
    iget-object v5, p0, Lcom/quago/mobile/sdk/e;->h:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    if-nez v3, :cond_3

    .line 37
    .line 38
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 39
    .line 40
    if-ne v2, v3, :cond_6

    .line 41
    .line 42
    iget-object v2, p0, Lcom/quago/mobile/sdk/e;->c:Lcom/quago/mobile/sdk/o0;

    .line 43
    .line 44
    invoke-static {p1, v2}, Lcom/quago/mobile/sdk/d;->a(Landroid/content/Context;Lcom/quago/mobile/sdk/o0;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_4

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    iget-object v5, p0, Lcom/quago/mobile/sdk/e;->d:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_6

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Landroid/hardware/Sensor;

    .line 69
    .line 70
    invoke-virtual {v6}, Landroid/hardware/Sensor;->getType()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eq v3, v7, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    iget-object v7, p0, Lcom/quago/mobile/sdk/e;->c:Lcom/quago/mobile/sdk/o0;

    .line 78
    .line 79
    iget-object v7, v7, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 80
    .line 81
    invoke-virtual {v7, v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getSampleRate(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-ne v7, v4, :cond_5

    .line 86
    .line 87
    iget-object v6, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    .line 88
    .line 89
    const-string v7, "enableBiometricSensor"

    .line 90
    .line 91
    const-string v8, "Missing sampleRate for type = %s"

    .line 92
    .line 93
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v6, v7, v8, v9}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    iget-object v8, p0, Lcom/quago/mobile/sdk/e;->g:Landroid/hardware/SensorManager;

    .line 102
    .line 103
    iget-object v9, p0, Lcom/quago/mobile/sdk/e;->b:Landroid/os/Handler;

    .line 104
    .line 105
    invoke-virtual {v8, p0, v6, v7, v9}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z

    .line 106
    .line 107
    .line 108
    iget-object v8, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    .line 109
    .line 110
    const-string v9, "enableBiometricSensor"

    .line 111
    .line 112
    const-string v10, "Enabled BiometricSensor = %s, sampleRate = %s"

    .line 113
    .line 114
    invoke-virtual {v6}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v8, v9, v10, v6}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v6, p0, Lcom/quago/mobile/sdk/e;->h:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v6, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :goto_3
    :try_start_1
    iget-object p2, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    .line 148
    .line 149
    const-string v0, "registerSensor"

    .line 150
    .line 151
    invoke-virtual {p2, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    .line 153
    .line 154
    :cond_7
    monitor-exit p0

    .line 155
    return-void

    .line 156
    :goto_4
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    throw p1
.end method

.method public final varargs declared-synchronized a([Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)V
    .locals 7

    monitor-enter p0

    .line 166
    :try_start_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/e;->h:Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    .line 167
    :cond_0
    :try_start_1
    array-length v0, p1

    if-nez v0, :cond_1

    .line 168
    iget-object p1, p0, Lcom/quago/mobile/sdk/e;->g:Landroid/hardware/SensorManager;

    invoke-virtual {p1, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 169
    iget-object p1, p0, Lcom/quago/mobile/sdk/e;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/quago/mobile/sdk/d;->a(Landroid/content/Context;)V

    .line 170
    iget-object p1, p0, Lcom/quago/mobile/sdk/e;->h:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto :goto_2

    .line 171
    :cond_1
    :try_start_2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    aget-object v2, p1, v1

    .line 172
    iget v3, v2, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->type:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    goto :goto_1

    :cond_2
    if-nez v3, :cond_3

    .line 173
    iget-object v3, p0, Lcom/quago/mobile/sdk/e;->h:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    if-ne v2, v3, :cond_3

    .line 175
    iget-object v2, p0, Lcom/quago/mobile/sdk/e;->e:Landroid/content/Context;

    invoke-static {v2}, Lcom/quago/mobile/sdk/d;->a(Landroid/content/Context;)V

    goto :goto_1

    .line 176
    :cond_3
    iget-object v3, p0, Lcom/quago/mobile/sdk/e;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/Sensor;

    .line 177
    iget v5, v2, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->type:I

    invoke-virtual {v4}, Landroid/hardware/Sensor;->getType()I

    move-result v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v5, v6, :cond_4

    .line 178
    :try_start_3
    iget-object v3, p0, Lcom/quago/mobile/sdk/e;->g:Landroid/hardware/SensorManager;

    invoke-virtual {v3, p0, v4}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 179
    iget-object v3, p0, Lcom/quago/mobile/sdk/e;->h:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    iget-object v2, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    const-string v3, "disableBiometricSensor"

    const-string v5, "Disabled BiometricSensor = %s"

    .line 181
    invoke-virtual {v4}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 182
    invoke-virtual {v2, v3, v5, v4}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v2

    .line 183
    :try_start_4
    iget-object v3, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    const-string v4, "disableBiometricSensor"

    invoke-virtual {v3, v4, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_5
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 184
    :goto_2
    :try_start_5
    iget-object v0, p0, Lcom/quago/mobile/sdk/e;->a:Lcom/quago/mobile/sdk/j0;

    const-string v1, "disableBiometricSensor"

    invoke-virtual {v0, v1, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_6
    monitor-exit p0

    return-void

    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/e;->c:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/o0;->a(Landroid/hardware/SensorEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
