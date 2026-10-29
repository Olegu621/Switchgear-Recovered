.class public final Lcom/google/android/gms/internal/drive/zzgo;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lar2;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/drive/zzgo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzbm:Z

.field private final zzbn:I

.field private final zzgy:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzgp;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzgp;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzgo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzgy:I

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzbn:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzbm:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getBatteryUsagePreference()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzbn:I

    .line 2
    .line 3
    return p0
.end method

.method public final getNetworkPreference()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzgy:I

    .line 2
    .line 3
    return p0
.end method

.method public final isRoamingAllowed()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzbm:Z

    .line 2
    .line 3
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzgy:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzbn:I

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean p0, p0, Lcom/google/android/gms/internal/drive/zzgo;->zzbm:Z

    .line 27
    .line 28
    invoke-static {p1, v2, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
