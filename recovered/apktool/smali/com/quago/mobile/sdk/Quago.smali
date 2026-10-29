.class public Lcom/quago/mobile/sdk/Quago;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field protected static LOG:Lcom/quago/mobile/sdk/j0;

.field protected static currActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field protected static lifecycleCallbacks:Lcom/quago/mobile/sdk/y;

.field protected static final quagoManager:Lcom/quago/mobile/sdk/o0;


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
    const-string v1, "Quago"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-instance v0, Lcom/quago/mobile/sdk/o0;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/quago/mobile/sdk/o0;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/quago/mobile/sdk/Quago;->currActivityRef:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static beginSegment(Ljava/lang/String;)V
    .locals 8

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "beginSegment"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-eqz p0, :cond_4

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 34
    .line 35
    new-array v0, v3, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v1, "Method called before SDK initialized!"

    .line 38
    .line 39
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    const-string v1, "INIT"

    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 52
    .line 53
    new-array v0, v3, [Ljava/lang/Object;

    .line 54
    .line 55
    const-string v1, "Can\'t use INIT as a name for segment!"

    .line 56
    .line 57
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 62
    .line 63
    new-instance v2, Lcom/quago/mobile/sdk/a1;

    .line 64
    .line 65
    iget-object v3, v0, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    iget-object v6, v0, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 72
    .line 73
    new-instance v7, Lcom/quago/mobile/sdk/g1;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 76
    .line 77
    invoke-direct {v7, v0}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    move-object v3, p0

    .line 82
    invoke-direct/range {v2 .. v7}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x5

    .line 86
    invoke-static {v1, p0, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {v1, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 95
    .line 96
    new-array v0, v3, [Ljava/lang/Object;

    .line 97
    .line 98
    const-string v1, "name is null or empty!"

    .line 99
    .line 100
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public static beginTracking()V
    .locals 1

    const/4 v0, 0x0

    .line 65
    invoke-static {v0}, Lcom/quago/mobile/sdk/Quago;->beginTracking(Ljava/lang/String;)V

    return-void
.end method

.method public static beginTracking(Ljava/lang/String;)V
    .locals 8

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "beginTracking"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 23
    .line 24
    new-array v0, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v1, "Method called before SDK initialized!"

    .line 27
    .line 28
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 33
    .line 34
    new-instance v2, Lcom/quago/mobile/sdk/a1;

    .line 35
    .line 36
    iget-object v3, v0, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-object v6, v0, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 43
    .line 44
    new-instance v7, Lcom/quago/mobile/sdk/g1;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 47
    .line 48
    invoke-direct {v7, v0}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    move-object v4, p0

    .line 53
    invoke-direct/range {v2 .. v7}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x7

    .line 57
    invoke-static {v1, p0, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v1, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static changeAppToken(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "changeAppToken"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-eqz p0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 34
    .line 35
    new-array v0, v3, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v1, "Method called before SDK initialized!"

    .line 38
    .line 39
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 44
    .line 45
    const/16 v1, 0xf

    .line 46
    .line 47
    invoke-static {v0, v1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 56
    .line 57
    new-array v0, v3, [Ljava/lang/Object;

    .line 58
    .line 59
    const-string v1, "newAppToken is null or empty!"

    .line 60
    .line 61
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static endSegment()V
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "endSegment"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v1, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v3, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 23
    .line 24
    new-array v1, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v3, "Method called before SDK initialized!"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static endTracking()V
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "endTracking"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v1, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v3, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 23
    .line 24
    new-array v1, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v3, "Method called before SDK initialized!"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 33
    .line 34
    const/16 v1, 0x9

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static getSessionId()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v2, "getSessionId"

    .line 13
    .line 14
    const-string v3, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->g:Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public static initialize(Landroid/app/Activity;Lcom/quago/mobile/sdk/QuagoSettings$Builder;)V
    .locals 0

    .line 128
    invoke-virtual {p1}, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->build()Lcom/quago/mobile/sdk/QuagoSettings;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/quago/mobile/sdk/Quago;->initialize(Landroid/app/Activity;Lcom/quago/mobile/sdk/QuagoSettings;)V

    return-void
.end method

.method public static initialize(Landroid/app/Activity;Lcom/quago/mobile/sdk/QuagoSettings;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v1, "initialize"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 14
    .line 15
    new-array p1, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v0, "activity is null."

    .line 18
    .line 19
    invoke-virtual {p0, v1, v0, p1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 26
    .line 27
    new-array p1, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    const-string v0, "settings is null."

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0, p1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget-object v3, p1, Lcom/quago/mobile/sdk/QuagoSettings;->appToken:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v3, :cond_7

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iget-boolean v3, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 47
    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 51
    .line 52
    new-array p1, v2, [Ljava/lang/Object;

    .line 53
    .line 54
    const-string v0, "A call to init() was made after SDK initialisation."

    .line 55
    .line 56
    invoke-virtual {p0, v1, v0, p1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-nez v3, :cond_5

    .line 65
    .line 66
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 67
    .line 68
    new-array p1, v2, [Ljava/lang/Object;

    .line 69
    .line 70
    const-string v0, "Application instance can\'t be obtained."

    .line 71
    .line 72
    invoke-virtual {p0, v1, v0, p1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 77
    .line 78
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sput-object v1, Lcom/quago/mobile/sdk/Quago;->currActivityRef:Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    sget-object v1, Lcom/quago/mobile/sdk/Quago;->lifecycleCallbacks:Lcom/quago/mobile/sdk/y;

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    invoke-virtual {v3, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    new-instance v1, Lcom/quago/mobile/sdk/y;

    .line 91
    .line 92
    invoke-direct {v1, p1}, Lcom/quago/mobile/sdk/y;-><init>(Lcom/quago/mobile/sdk/QuagoSettings;)V

    .line 93
    .line 94
    .line 95
    sput-object v1, Lcom/quago/mobile/sdk/Quago;->lifecycleCallbacks:Lcom/quago/mobile/sdk/y;

    .line 96
    .line 97
    invoke-virtual {v1, p0}, Lcom/quago/mobile/sdk/y;->a(Landroid/app/Activity;)V

    .line 98
    .line 99
    .line 100
    sget-object v1, Lcom/quago/mobile/sdk/Quago;->lifecycleCallbacks:Lcom/quago/mobile/sdk/y;

    .line 101
    .line 102
    invoke-virtual {v3, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p1, Lcom/quago/mobile/sdk/QuagoSettings;->logLevel:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 106
    .line 107
    invoke-static {v1}, Lcom/quago/mobile/sdk/k0;->a(Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p1, Lcom/quago/mobile/sdk/QuagoSettings;->loggerCallback:Lcom/quago/mobile/sdk/utils/IQuagoLog;

    .line 111
    .line 112
    sput-object v1, Lcom/quago/mobile/sdk/k0;->c:Lcom/quago/mobile/sdk/utils/IQuagoLog;

    .line 113
    .line 114
    invoke-virtual {v0, p0, v3, p1}, Lcom/quago/mobile/sdk/o0;->a(Landroid/app/Activity;Landroid/app/Application;Lcom/quago/mobile/sdk/QuagoSettings;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_7
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 119
    .line 120
    new-array p1, v2, [Ljava/lang/Object;

    .line 121
    .line 122
    const-string v0, "AppToken is either null or empty."

    .line 123
    .line 124
    invoke-virtual {p0, v1, v0, p1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public static onPause()V
    .locals 5

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "onPause"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v1, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v3, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 23
    .line 24
    new-array v1, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v3, "Method called before SDK initialized!"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 37
    .line 38
    new-array v1, v3, [Ljava/lang/Object;

    .line 39
    .line 40
    const-string v3, "Application is null!"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    sget-object v1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 47
    .line 48
    new-array v3, v3, [Ljava/lang/Object;

    .line 49
    .line 50
    const-string v4, "Called"

    .line 51
    .line 52
    invoke-virtual {v1, v2, v4, v3}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 56
    .line 57
    new-instance v1, Lcom/quago/mobile/sdk/w;

    .line 58
    .line 59
    sget-object v2, Lcom/quago/mobile/sdk/f;->c:Lcom/quago/mobile/sdk/f;

    .line 60
    .line 61
    invoke-direct {v1, v2}, Lcom/quago/mobile/sdk/w;-><init>(Lcom/quago/mobile/sdk/f;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/w;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static onResume()V
    .locals 6

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "onResume"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v1, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v3, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget-object v1, Lcom/quago/mobile/sdk/Quago;->currActivityRef:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroid/app/Activity;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-boolean v4, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 32
    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 36
    .line 37
    new-array v1, v3, [Ljava/lang/Object;

    .line 38
    .line 39
    const-string v3, "Method called before SDK initialized!"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object v4, v0, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    if-nez v4, :cond_3

    .line 48
    .line 49
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 50
    .line 51
    new-array v1, v3, [Ljava/lang/Object;

    .line 52
    .line 53
    const-string v3, "Application is null!"

    .line 54
    .line 55
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    sget-object v4, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 60
    .line 61
    new-array v3, v3, [Ljava/lang/Object;

    .line 62
    .line 63
    const-string v5, "Called"

    .line 64
    .line 65
    invoke-virtual {v4, v2, v5, v3}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 69
    .line 70
    new-instance v3, Lcom/quago/mobile/sdk/w;

    .line 71
    .line 72
    sget-object v4, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 73
    .line 74
    invoke-direct {v3, v4}, Lcom/quago/mobile/sdk/w;-><init>(Lcom/quago/mobile/sdk/f;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/w;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/quago/mobile/sdk/o0;->a(Landroid/app/Activity;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 84
    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->q:Lcom/quago/mobile/sdk/e;

    .line 88
    .line 89
    iget-object v2, v0, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Landroid/content/Context;

    .line 96
    .line 97
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 98
    .line 99
    invoke-virtual {v1, v2, v0}, Lcom/quago/mobile/sdk/e;->a(Landroid/content/Context;[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    :goto_0
    return-void
.end method

.method public static onStop()V
    .locals 6

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "onStop"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v1, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v3, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 23
    .line 24
    new-array v1, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v3, "Method called before SDK initialized!"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 37
    .line 38
    new-array v1, v3, [Ljava/lang/Object;

    .line 39
    .line 40
    const-string v3, "Application is null!"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    sget-object v1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 47
    .line 48
    new-array v4, v3, [Ljava/lang/Object;

    .line 49
    .line 50
    const-string v5, "Called"

    .line 51
    .line 52
    invoke-virtual {v1, v2, v5, v4}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 56
    .line 57
    new-instance v2, Lcom/quago/mobile/sdk/w;

    .line 58
    .line 59
    sget-object v4, Lcom/quago/mobile/sdk/f;->d:Lcom/quago/mobile/sdk/f;

    .line 60
    .line 61
    invoke-direct {v2, v4}, Lcom/quago/mobile/sdk/w;-><init>(Lcom/quago/mobile/sdk/f;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/w;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->q:Lcom/quago/mobile/sdk/e;

    .line 68
    .line 69
    new-array v1, v3, [Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/quago/mobile/sdk/e;->a([Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static setAdditionalId(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "setAdditionalId"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-eqz p0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 34
    .line 35
    new-array v0, v3, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v1, "Method called before SDK initialized!"

    .line 38
    .line 39
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 44
    .line 45
    const/16 v1, 0xd

    .line 46
    .line 47
    invoke-static {v0, v1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 56
    .line 57
    new-array v0, v3, [Ljava/lang/Object;

    .line 58
    .line 59
    const-string v1, "matchingId is null or empty!"

    .line 60
    .line 61
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static setKeyValues(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "setKeyValues"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array p1, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v0, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v0, p1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-eqz p0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 42
    .line 43
    new-array p1, v3, [Ljava/lang/Object;

    .line 44
    .line 45
    const-string v0, "Method called before SDK initialized!"

    .line 46
    .line 47
    invoke-virtual {p0, v2, v0, p1}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 52
    .line 53
    filled-new-array {p0, p1}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/16 p1, 0xa

    .line 58
    .line 59
    invoke-static {v0, p1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 68
    .line 69
    new-array p1, v3, [Ljava/lang/Object;

    .line 70
    .line 71
    const-string v0, "key or value is null or empty!"

    .line 72
    .line 73
    invoke-virtual {p0, v2, v0, p1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static setUserId(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    const-string v2, "setUserId"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "method called before SDK initialized!"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-eqz p0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 34
    .line 35
    new-array v0, v3, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v1, "Method called before SDK initialized!"

    .line 38
    .line 39
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->w:Lcom/quago/mobile/sdk/n0;

    .line 44
    .line 45
    const/16 v1, 0xc

    .line 46
    .line 47
    invoke-static {v0, v1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/Quago;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 56
    .line 57
    new-array v0, v3, [Ljava/lang/Object;

    .line 58
    .line 59
    const-string v1, "userId is null or empty!"

    .line 60
    .line 61
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
