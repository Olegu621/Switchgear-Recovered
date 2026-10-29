.class public final Lum3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Lpn3;


# direct methods
.method public constructor <init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;I)V
    .locals 0

    .line 1
    iput p3, p0, Lum3;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lum3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 10
    .line 11
    iput-object p1, p0, Lum3;->c:Lpn3;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lum3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lum3;->c:Lpn3;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lum3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lum3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 4
    .line 5
    iget-object p0, p0, Lum3;->c:Lpn3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 11
    .line 12
    iget-object v2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lij3;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object p0, v2, Lij3;->f:Luh3;

    .line 19
    .line 20
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 24
    .line 25
    const-string v0, "Failed to send consent settings to service"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    :try_start_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/zzga;->q0(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lpn3;->M()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    iget-object v0, v2, Lij3;->f:Luh3;

    .line 40
    .line 41
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 45
    .line 46
    const-string v1, "Failed to send consent settings to the service"

    .line 47
    .line 48
    invoke-virtual {v0, p0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_0
    iget-object v0, p0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 53
    .line 54
    iget-object v2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lij3;

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    iget-object p0, v2, Lij3;->f:Luh3;

    .line 61
    .line 62
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 66
    .line 67
    const-string v0, "Discarding data. Failed to send app launch"

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_1
    :try_start_1
    iget-object v3, v2, Lij3;->d:Lpd3;

    .line 74
    .line 75
    sget-object v4, Lvg3;->c1:Lug3;

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-virtual {v3, v5, v4}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0, v0, v5, v1}, Lpn3;->R(Lcom/google/android/gms/measurement/internal/zzga;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catch_1
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    :goto_1
    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/zzga;->V(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lij3;->n()Llh3;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Llh3;->E()Z

    .line 98
    .line 99
    .line 100
    iget-object v3, v2, Lij3;->d:Lpd3;

    .line 101
    .line 102
    invoke-virtual {v3, v5, v4}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v0, v5, v1}, Lpn3;->R(Lcom/google/android/gms/measurement/internal/zzga;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lpn3;->M()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :goto_2
    iget-object v0, v2, Lij3;->f:Luh3;

    .line 113
    .line 114
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 118
    .line 119
    const-string v1, "Failed to send app launch to the service"

    .line 120
    .line 121
    invoke-virtual {v0, p0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
