.class public final Lcom/quago/mobile/sdk/t;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/hardware/input/InputManager$InputDeviceListener;


# instance fields
.field public final a:Lcom/quago/mobile/sdk/j0;

.field public final b:Landroid/hardware/input/InputManager;

.field public final c:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/hardware/input/InputManager;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "InputDevicesManager"

    .line 5
    .line 6
    invoke-static {v0}, Lcom/quago/mobile/sdk/k0;->a(Ljava/lang/String;)Lcom/quago/mobile/sdk/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/quago/mobile/sdk/t;->c:Ljava/util/HashMap;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/quago/mobile/sdk/t;->b:Landroid/hardware/input/InputManager;

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/hardware/input/InputManager;->getInputDeviceIds()[I

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    array-length v1, p1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    if-ge v2, v1, :cond_2

    .line 31
    .line 32
    aget v3, p1, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 33
    .line 34
    :try_start_1
    iget-object v4, p0, Lcom/quago/mobile/sdk/t;->b:Landroid/hardware/input/InputManager;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v5, p0, Lcom/quago/mobile/sdk/t;->c:Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v7, Lcom/quago/mobile/sdk/i0;

    .line 50
    .line 51
    invoke-direct {v7, v3, v4}, Lcom/quago/mobile/sdk/i0;-><init>(ILandroid/view/InputDevice;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception v3

    .line 59
    :try_start_2
    iget-object v4, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 60
    .line 61
    const-string v5, "InputDevicesManager-inner"

    .line 62
    .line 63
    invoke-virtual {v4, v5, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 64
    .line 65
    .line 66
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_1
    move-exception p1

    .line 70
    iget-object p0, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 71
    .line 72
    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method public final a(I)Lcom/quago/mobile/sdk/i0;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/t;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/quago/mobile/sdk/i0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    iget-object p0, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 16
    .line 17
    const-string v0, "getInputDevice"

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final onInputDeviceAdded(I)V
    .locals 4

    .line 1
    const-string v0, "onInputDeviceAdded"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/quago/mobile/sdk/t;->b:Landroid/hardware/input/InputManager;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    new-instance v2, Lcom/quago/mobile/sdk/i0;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v2, p1, v1}, Lcom/quago/mobile/sdk/i0;-><init>(ILandroid/view/InputDevice;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/quago/mobile/sdk/t;->c:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 27
    .line 28
    const-string v3, "DeviceId %s by the name \'%s\' - Added"

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v2, v2, Lcom/quago/mobile/sdk/i0;->g:Ljava/lang/String;

    .line 35
    .line 36
    filled-new-array {p1, v2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, v0, v3, p1}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception p1

    .line 45
    iget-object p0, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 46
    .line 47
    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final onInputDeviceChanged(I)V
    .locals 4

    .line 1
    const-string v0, "onInputDeviceChanged"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/quago/mobile/sdk/t;->b:Landroid/hardware/input/InputManager;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    new-instance v2, Lcom/quago/mobile/sdk/i0;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v2, p1, v1}, Lcom/quago/mobile/sdk/i0;-><init>(ILandroid/view/InputDevice;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/quago/mobile/sdk/t;->c:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 27
    .line 28
    const-string v3, "DeviceId %s by the name \'%s\' - Changed"

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v2, v2, Lcom/quago/mobile/sdk/i0;->g:Ljava/lang/String;

    .line 35
    .line 36
    filled-new-array {p1, v2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, v0, v3, p1}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception p1

    .line 45
    iget-object p0, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 46
    .line 47
    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final onInputDeviceRemoved(I)V
    .locals 4

    .line 1
    const-string v0, "onInputDeviceRemoved"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 4
    .line 5
    sget-object v2, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 6
    .line 7
    iget v1, v1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    .line 8
    .line 9
    invoke-static {v1}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/t;->a(I)Lcom/quago/mobile/sdk/i0;

    .line 16
    .line 17
    .line 18
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    iget-object v2, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    :try_start_1
    const-string v1, "DeviceId %s - Removed"

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v2, v0, v1, p1}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string v3, "DeviceId %s by the name \'%s\' - Removed"

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v1, v1, Lcom/quago/mobile/sdk/i0;->g:Ljava/lang/String;

    .line 46
    .line 47
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, v0, v3, p1}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :goto_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/t;->a:Lcom/quago/mobile/sdk/j0;

    .line 56
    .line 57
    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
