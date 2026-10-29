.class public final Lcom/google/android/gms/internal/drive/zzj;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/drive/zzj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzbv:Lcom/google/android/gms/drive/events/zze;

.field final zzda:I

.field private final zzdb:Lcom/google/android/gms/drive/events/zzx;

.field private final zzdc:Lcom/google/android/gms/drive/events/zzt;

.field final zzk:Lcom/google/android/gms/drive/DriveId;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzk;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzk;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzj;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/drive/DriveId;)V
    .locals 6

    .line 15
    invoke-static {p2}, Lkb1;->n(Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzj;-><init>(Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/zze;Lcom/google/android/gms/drive/events/zzx;Lcom/google/android/gms/drive/events/zzt;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/zze;Lcom/google/android/gms/drive/events/zzx;Lcom/google/android/gms/drive/events/zzt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzj;->zzk:Lcom/google/android/gms/drive/DriveId;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/drive/zzj;->zzda:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzj;->zzbv:Lcom/google/android/gms/drive/events/zze;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/drive/zzj;->zzdb:Lcom/google/android/gms/drive/events/zzx;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/drive/zzj;->zzdc:Lcom/google/android/gms/drive/events/zzt;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzj;->zzk:Lcom/google/android/gms/drive/DriveId;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v1, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzj;->zzda:I

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    const/4 v4, 0x4

    .line 18
    invoke-static {p1, v2, v4}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzj;->zzbv:Lcom/google/android/gms/drive/events/zze;

    .line 25
    .line 26
    invoke-static {p1, v4, v1, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x5

    .line 30
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzj;->zzdb:Lcom/google/android/gms/drive/events/zzx;

    .line 31
    .line 32
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzj;->zzdc:Lcom/google/android/gms/drive/events/zzt;

    .line 37
    .line 38
    invoke-static {p1, v1, p0, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
