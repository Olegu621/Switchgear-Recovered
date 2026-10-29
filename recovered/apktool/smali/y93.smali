.class public final Ly93;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly93;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ly93;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    iget v0, p0, Ly93;->a:I

    .line 2
    .line 3
    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ly93;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lyr3;

    .line 11
    .line 12
    iget-object v2, v0, Lyr3;->b:Lc5;

    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v2, v1, p1}, Lc5;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lmr3;

    .line 22
    .line 23
    invoke-direct {p1, p0, p2}, Lmr3;-><init>(Ly93;Landroid/os/IBinder;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lyr3;->a()Landroid/os/Handler;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    const-string p1, "BillingClientTesting"

    .line 35
    .line 36
    const-string v0, "Billing Override Service connected."

    .line 37
    .line 38
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Ly93;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lgf3;

    .line 44
    .line 45
    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/zzau;->zzc(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/zzav;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iput-object p2, p1, Lgf3;->D:Lcom/google/android/gms/internal/play_billing/zzav;

    .line 50
    .line 51
    iget-object p1, p0, Ly93;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lgf3;

    .line 54
    .line 55
    const/4 p2, 0x2

    .line 56
    iput p2, p1, Lgf3;->C:I

    .line 57
    .line 58
    iget-object p0, p0, Ly93;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lgf3;

    .line 61
    .line 62
    const/16 p1, 0x1a

    .line 63
    .line 64
    invoke-static {p1}, Lif3;->d(I)Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string p2, "ApiSuccess should not be null"

    .line 69
    .line 70
    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lej;->g:Lwe2;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lwe2;->v(Lcom/google/android/gms/internal/play_billing/zzkd;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_1
    iget-object v0, p0, Ly93;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lz93;

    .line 82
    .line 83
    iget-object v2, v0, Lz93;->b:Lqa3;

    .line 84
    .line 85
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v2, v1, p1}, Lqa3;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Lw93;

    .line 93
    .line 94
    invoke-direct {p1, p0, p2}, Lw93;-><init>(Ly93;Landroid/os/IBinder;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lz93;->a()Landroid/os/Handler;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    iget v0, p0, Ly93;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ly93;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lyr3;

    .line 12
    .line 13
    iget-object v1, v0, Lyr3;->b:Lc5;

    .line 14
    .line 15
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v1, v2, p1}, Lc5;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lxq3;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {p1, p0, v1}, Lxq3;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lyr3;->a()Landroid/os/Handler;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    const-string p1, "BillingClientTesting"

    .line 37
    .line 38
    const-string v0, "Billing Override Service disconnected."

    .line 39
    .line 40
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Ly93;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lgf3;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    iput-object v0, p1, Lgf3;->D:Lcom/google/android/gms/internal/play_billing/zzav;

    .line 49
    .line 50
    iget-object p0, p0, Ly93;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lgf3;

    .line 53
    .line 54
    iput v1, p0, Lgf3;->C:I

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_1
    iget-object v0, p0, Ly93;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lz93;

    .line 60
    .line 61
    iget-object v3, v0, Lz93;->b:Lqa3;

    .line 62
    .line 63
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v3, v2, p1}, Lqa3;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lx93;

    .line 71
    .line 72
    invoke-direct {p1, p0, v1}, Lx93;-><init>(Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lz93;->a()Landroid/os/Handler;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
