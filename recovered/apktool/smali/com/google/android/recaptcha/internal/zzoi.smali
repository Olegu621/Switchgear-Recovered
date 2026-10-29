.class final Lcom/google/android/recaptcha/internal/zzoi;
.super Lcom/google/android/recaptcha/internal/zzof;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zza:Lcom/google/android/recaptcha/internal/zzof;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzoi;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzoi;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzoi;->zza:Lcom/google/android/recaptcha/internal/zzof;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzof;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Lcom/google/android/recaptcha/internal/zzog;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/google/android/recaptcha/internal/zzog;-><init>(Lcom/google/android/recaptcha/internal/zzoh;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final zzb()Lcom/google/android/recaptcha/internal/zzof;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzoi;->zza:Lcom/google/android/recaptcha/internal/zzof;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "No-op Provider"

    .line 2
    .line 3
    return-object p0
.end method
