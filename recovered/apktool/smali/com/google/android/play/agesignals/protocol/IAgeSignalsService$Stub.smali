.class public abstract Lcom/google/android/play/agesignals/protocol/IAgeSignalsService$Stub;
.super Lcom/google/android/gms/internal/playcore_age_signals/zzb;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/play/agesignals/protocol/IAgeSignalsService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/play/agesignals/protocol/IAgeSignalsService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/play/agesignals/protocol/IAgeSignalsService$Stub$Proxy;
    }
.end annotation


# static fields
.field public static final synthetic a:I


# virtual methods
.method public final dispatchTransaction(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    .line 1
    const/4 p3, 0x1

    .line 2
    if-ne p1, p3, :cond_2

    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/playcore_age_signals/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    check-cast p4, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v1, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback"

    .line 25
    .line 26
    invoke-interface {v0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    instance-of v3, v2, Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    move-object v0, v2

    .line 35
    check-cast v0, Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance v2, Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback$Stub$Proxy;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/playcore_age_signals/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object v0, v2

    .line 44
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/playcore_age_signals/zzc;->zzb(Landroid/os/Parcel;)V

    .line 45
    .line 46
    .line 47
    check-cast v0, Lfg3;

    .line 48
    .line 49
    invoke-interface {p0, p1, p4, v0}, Lcom/google/android/play/agesignals/protocol/IAgeSignalsService;->n0(Ljava/lang/String;Landroid/os/Bundle;Lfg3;)V

    .line 50
    .line 51
    .line 52
    return p3

    .line 53
    :cond_2
    const/4 p0, 0x0

    .line 54
    return p0
.end method
