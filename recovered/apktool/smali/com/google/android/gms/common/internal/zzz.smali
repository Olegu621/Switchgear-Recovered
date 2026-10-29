.class public abstract Lcom/google/android/gms/common/internal/zzz;
.super Lcom/google/android/gms/internal/common/zzb;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/common/internal/IGmsCallbacks;


# virtual methods
.method public final zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5

    .line 1
    const/4 p4, 0x0

    .line 2
    const-string v0, "onPostInitComplete can be called only once per call to getRemoteService"

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p1, v1, :cond_2

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eq p1, v2, :cond_1

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-eq p1, v2, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lcom/google/android/gms/common/internal/zzj;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 24
    .line 25
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/common/zzc;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lcom/google/android/gms/common/internal/zzj;

    .line 30
    .line 31
    invoke-static {p2}, Lcom/google/android/gms/internal/common/zzc;->zzf(Landroid/os/Parcel;)V

    .line 32
    .line 33
    .line 34
    check-cast p0, Lcom/google/android/gms/common/internal/zzd;

    .line 35
    .line 36
    iget-object p2, p0, Lcom/google/android/gms/common/internal/zzd;->a:Lcom/google/android/gms/common/internal/a;

    .line 37
    .line 38
    const-string v4, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    .line 39
    .line 40
    invoke-static {p2, v4}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, Lkb1;->n(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v3}, Lcom/google/android/gms/common/internal/a;->zzc(Lcom/google/android/gms/common/internal/zzj;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, v3, Lcom/google/android/gms/common/internal/zzj;->a:Landroid/os/Bundle;

    .line 50
    .line 51
    iget-object v3, p0, Lcom/google/android/gms/common/internal/zzd;->a:Lcom/google/android/gms/common/internal/a;

    .line 52
    .line 53
    invoke-static {v3, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/google/android/gms/common/internal/zzd;->a:Lcom/google/android/gms/common/internal/a;

    .line 57
    .line 58
    iget v3, p0, Lcom/google/android/gms/common/internal/zzd;->b:I

    .line 59
    .line 60
    invoke-virtual {v0, p1, v2, p2, v3}, Lcom/google/android/gms/common/internal/a;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    .line 61
    .line 62
    .line 63
    iput-object p4, p0, Lcom/google/android/gms/common/internal/zzd;->a:Lcom/google/android/gms/common/internal/a;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 67
    .line 68
    .line 69
    sget-object p0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 70
    .line 71
    invoke-static {p2, p0}, Lcom/google/android/gms/internal/common/zzc;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Landroid/os/Bundle;

    .line 76
    .line 77
    invoke-static {p2}, Lcom/google/android/gms/internal/common/zzc;->zzf(Landroid/os/Parcel;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, Ljava/lang/Exception;

    .line 81
    .line 82
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string p1, "GmsClient"

    .line 86
    .line 87
    const-string p2, "received deprecated onAccountValidationComplete callback, ignoring"

    .line 88
    .line 89
    invoke-static {p1, p2, p0}, Lio/sentry/android/core/n0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 102
    .line 103
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/common/zzc;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    check-cast v3, Landroid/os/Bundle;

    .line 108
    .line 109
    invoke-static {p2}, Lcom/google/android/gms/internal/common/zzc;->zzf(Landroid/os/Parcel;)V

    .line 110
    .line 111
    .line 112
    check-cast p0, Lcom/google/android/gms/common/internal/zzd;

    .line 113
    .line 114
    iget-object p2, p0, Lcom/google/android/gms/common/internal/zzd;->a:Lcom/google/android/gms/common/internal/a;

    .line 115
    .line 116
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object p2, p0, Lcom/google/android/gms/common/internal/zzd;->a:Lcom/google/android/gms/common/internal/a;

    .line 120
    .line 121
    iget v0, p0, Lcom/google/android/gms/common/internal/zzd;->b:I

    .line 122
    .line 123
    invoke-virtual {p2, p1, v2, v3, v0}, Lcom/google/android/gms/common/internal/a;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    .line 124
    .line 125
    .line 126
    iput-object p4, p0, Lcom/google/android/gms/common/internal/zzd;->a:Lcom/google/android/gms/common/internal/a;

    .line 127
    .line 128
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 129
    .line 130
    .line 131
    return v1
.end method
