.class public final Lcom/google/android/gms/internal/auth-api-phone/zzr;
.super Lor0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lor0;"
    }
.end annotation


# static fields
.field private static final zza:Le9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le9;"
        }
    .end annotation
.end field

.field private static final zzb:Lw8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw8;"
        }
    .end annotation
.end field

.field private static final zzc:Lh9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh9;"
        }
    .end annotation
.end field


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
    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zza:Le9;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzn;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api-phone/zzn;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzb:Lw8;

    .line 14
    .line 15
    new-instance v2, Lh9;

    .line 16
    .line 17
    const-string v3, "SmsCodeAutofill.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzc:Lh9;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6

    .line 1
    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzc:Lh9;

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

    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzc:Lh9;

    .line 14
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
.method public final checkPermissionState()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
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
    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zza:Lcom/google/android/gms/common/Feature;

    .line 6
    .line 7
    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, Ltm2;->c:[Lcom/google/android/gms/common/Feature;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzk;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzk;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzr;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 19
    .line 20
    const/16 v1, 0x61c

    .line 21
    .line 22
    iput v1, v0, Ltm2;->d:I

    .line 23
    .line 24
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final hasOngoingSmsRequest(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    xor-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    const-string v1, "The package name cannot be empty."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zza:Lcom/google/android/gms/common/Feature;

    .line 20
    .line 21
    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, v0, Ltm2;->c:[Lcom/google/android/gms/common/Feature;

    .line 26
    .line 27
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzm;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api-phone/zzm;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzr;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 33
    .line 34
    const/16 p1, 0x61d

    .line 35
    .line 36
    iput p1, v0, Ltm2;->d:I

    .line 37
    .line 38
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public final startSmsCodeRetriever()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
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
    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zza:Lcom/google/android/gms/common/Feature;

    .line 6
    .line 7
    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, Ltm2;->c:[Lcom/google/android/gms/common/Feature;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzl;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzl;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzr;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 19
    .line 20
    const/16 v1, 0x61b

    .line 21
    .line 22
    iput v1, v0, Ltm2;->d:I

    .line 23
    .line 24
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
