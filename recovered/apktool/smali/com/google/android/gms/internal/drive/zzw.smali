.class public final Lcom/google/android/gms/internal/drive/zzw;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/drive/zzw;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzan:Ljava/lang/String;

.field private final zzdf:Lcom/google/android/gms/drive/Contents;

.field private final zzdn:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field private final zzdo:Ljava/lang/Integer;

.field private final zzdp:Lcom/google/android/gms/drive/DriveId;

.field private final zzdq:Z

.field private final zzdr:I

.field private final zzds:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzx;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzx;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IILkf0;)V
    .locals 9

    .line 61
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v8, p3

    move v4, p4

    .line 62
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/drive/zzw;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Lcom/google/android/gms/drive/Contents;IZLjava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Lcom/google/android/gms/drive/Contents;IZLjava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    if-eqz p8, :cond_1

    .line 7
    .line 8
    iget v0, p3, Lcom/google/android/gms/drive/Contents;->b:I

    .line 9
    .line 10
    if-ne v0, p8, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    const-string v1, "inconsistent contents reference"

    .line 16
    .line 17
    invoke-static {v1, v0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    :cond_1
    if-nez p4, :cond_3

    .line 21
    .line 22
    if-nez p3, :cond_3

    .line 23
    .line 24
    if-eqz p8, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const-string p0, "Need a valid contents"

    .line 28
    .line 29
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0

    .line 34
    :cond_3
    :goto_1
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdp:Lcom/google/android/gms/drive/DriveId;

    .line 38
    .line 39
    invoke-static {p2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdn:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 43
    .line 44
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdf:Lcom/google/android/gms/drive/Contents;

    .line 45
    .line 46
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdo:Ljava/lang/Integer;

    .line 51
    .line 52
    iput-object p6, p0, Lcom/google/android/gms/internal/drive/zzw;->zzan:Ljava/lang/String;

    .line 53
    .line 54
    iput p7, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdr:I

    .line 55
    .line 56
    iput-boolean p5, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdq:Z

    .line 57
    .line 58
    iput p8, p0, Lcom/google/android/gms/internal/drive/zzw;->zzds:I

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

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
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdp:Lcom/google/android/gms/drive/DriveId;

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
    const/4 v1, 0x3

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdn:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdf:Lcom/google/android/gms/drive/Contents;

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-static {p1, v2, v1, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x5

    .line 27
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdo:Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-static {p1, p2, v1}, Lw11;->Q(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 30
    .line 31
    .line 32
    iget-boolean p2, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdq:Z

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    const/4 p2, 0x7

    .line 42
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzw;->zzan:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1, p2, v1, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    iget p2, p0, Lcom/google/android/gms/internal/drive/zzw;->zzdr:I

    .line 48
    .line 49
    const/16 v1, 0x8

    .line 50
    .line 51
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 55
    .line 56
    .line 57
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzw;->zzds:I

    .line 58
    .line 59
    const/16 p2, 0x9

    .line 60
    .line 61
    invoke-static {p1, p2, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
