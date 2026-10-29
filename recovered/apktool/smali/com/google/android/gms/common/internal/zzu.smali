.class public final Lcom/google/android/gms/common/internal/zzu;
.super Lcom/google/android/gms/internal/common/zza;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/common/internal/ICancelToken;


# virtual methods
.method public final cancel()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/common/zza;->zza()Landroid/os/Parcel;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/common/zza;->zzC(ILandroid/os/Parcel;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
