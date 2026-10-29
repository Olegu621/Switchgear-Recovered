.class public final Lcom/google/android/gms/internal/drive/zzfp;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/drive/zzfp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzda:I

.field private final zzib:Lcom/google/android/gms/drive/events/ChangeEvent;

.field private final zzic:Lcom/google/android/gms/drive/events/CompletionEvent;

.field private final zzid:Lcom/google/android/gms/drive/events/zzo;

.field private final zzie:Lcom/google/android/gms/drive/events/zzb;

.field private final zzif:Lcom/google/android/gms/drive/events/zzv;

.field private final zzig:Lcom/google/android/gms/drive/events/zzr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzfq;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzfq;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzfp;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/drive/events/ChangeEvent;Lcom/google/android/gms/drive/events/CompletionEvent;Lcom/google/android/gms/drive/events/zzo;Lcom/google/android/gms/drive/events/zzb;Lcom/google/android/gms/drive/events/zzv;Lcom/google/android/gms/drive/events/zzr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzda:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzib:Lcom/google/android/gms/drive/events/ChangeEvent;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzic:Lcom/google/android/gms/drive/events/CompletionEvent;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzid:Lcom/google/android/gms/drive/events/zzo;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzie:Lcom/google/android/gms/drive/events/zzb;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzif:Lcom/google/android/gms/drive/events/zzv;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzig:Lcom/google/android/gms/drive/events/zzr;

    .line 17
    .line 18
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
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzda:I

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-static {p1, v3, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzib:Lcom/google/android/gms/drive/events/ChangeEvent;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p1, v2, v1, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzic:Lcom/google/android/gms/drive/events/CompletionEvent;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzid:Lcom/google/android/gms/drive/events/zzo;

    .line 32
    .line 33
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x7

    .line 37
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzie:Lcom/google/android/gms/drive/events/zzb;

    .line 38
    .line 39
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x9

    .line 43
    .line 44
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzif:Lcom/google/android/gms/drive/events/zzv;

    .line 45
    .line 46
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 47
    .line 48
    .line 49
    const/16 v1, 0xa

    .line 50
    .line 51
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzig:Lcom/google/android/gms/drive/events/zzr;

    .line 52
    .line 53
    invoke-static {p1, v1, p0, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final zzat()Lcom/google/android/gms/drive/events/DriveEvent;
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzda:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_5

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x7

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzig:Lcom/google/android/gms/drive/events/zzr;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const/16 v2, 0x21

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 32
    .line 33
    .line 34
    const-string v2, "Unexpected event type "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzif:Lcom/google/android/gms/drive/events/zzv;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzie:Lcom/google/android/gms/drive/events/zzb;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_3
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzid:Lcom/google/android/gms/drive/events/zzo;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzic:Lcom/google/android/gms/drive/events/CompletionEvent;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_5
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfp;->zzib:Lcom/google/android/gms/drive/events/ChangeEvent;

    .line 63
    .line 64
    return-object p0
.end method
