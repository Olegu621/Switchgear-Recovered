.class public final Lcom/google/android/gms/internal/fido/zzy;
.super Lor0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zza:Le9;

.field private static final zzb:Lh9;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/fido/zzy;->zza:Le9;

    .line 7
    .line 8
    new-instance v1, Lh9;

    .line 9
    .line 10
    new-instance v2, Lcom/google/android/gms/internal/fido/zzz;

    .line 11
    .line 12
    invoke-direct {v2}, Lcom/google/android/gms/internal/fido/zzz;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v3, "Fido.FIDO_SOURCE_DIRECT_TRANSFER_API"

    .line 16
    .line 17
    invoke-direct {v1, v3, v2, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/google/android/gms/internal/fido/zzy;->zzb:Lh9;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6

    .line 1
    sget-object v3, Lcom/google/android/gms/internal/fido/zzy;->zzb:Lh9;

    .line 2
    .line 3
    sget-object v4, Lb9;->g:La9;

    .line 4
    .line 5
    sget-object v5, Lnr0;->c:Lnr0;

    .line 6
    .line 7
    move-object v2, p1

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 14
    sget-object v3, Lcom/google/android/gms/internal/fido/zzy;->zzb:Lh9;

    sget-object v5, Lnr0;->c:Lnr0;

    const/4 v2, 0x0

    .line 15
    sget-object v4, Lb9;->g:La9;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    return-void
.end method


# virtual methods
.method public final getSourceDirectTransferResultFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/fido/sourcedevice/SourceDirectTransferResult;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Li9;
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/google/android/gms/common/api/Status;->i:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    const-string v0, "source_direct_transfer_result"

    .line 6
    .line 7
    sget-object v1, Lcom/google/android/gms/fido/sourcedevice/SourceDirectTransferResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Li13;->m(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/google/android/gms/fido/sourcedevice/SourceDirectTransferResult;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance p1, Li9;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Li9;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    new-instance p1, Li9;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Li9;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public final startDirectTransfer(Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;Landroid/os/ParcelFileDescriptor;Landroid/os/ParcelFileDescriptor;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/os/ParcelFileDescriptor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/gms/internal/fido/zzw;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/fido/zzw;-><init>(Lcom/google/android/gms/internal/fido/zzy;Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;Landroid/os/ParcelFileDescriptor;Landroid/os/ParcelFileDescriptor;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 11
    .line 12
    const/16 p1, 0x152d

    .line 13
    .line 14
    iput p1, v0, Ltm2;->d:I

    .line 15
    .line 16
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
