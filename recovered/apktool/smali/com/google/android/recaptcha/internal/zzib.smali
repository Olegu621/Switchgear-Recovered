.class public final Lcom/google/android/recaptcha/internal/zzib;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private final zza:Lp51;

.field private final zzb:Lp51;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/google/android/recaptcha/internal/zzby;->zza:I

    .line 5
    .line 6
    sget-object v0, Lcom/google/android/recaptcha/internal/zzhz;->zza:Lcom/google/android/recaptcha/internal/zzhz;

    .line 7
    .line 8
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzib;->zza:Lp51;

    .line 13
    .line 14
    sget-object v0, Lcom/google/android/recaptcha/internal/zzia;->zza:Lcom/google/android/recaptcha/internal/zzia;

    .line 15
    .line 16
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzib;->zzb:Lp51;

    .line 21
    .line 22
    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzib;)Lcom/google/android/recaptcha/internal/zzbt;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzib;->zza:Lp51;

    .line 2
    .line 3
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/recaptcha/internal/zzbt;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final synthetic zzb(Lcom/google/android/recaptcha/internal/zzib;)Lcom/google/android/recaptcha/internal/zzhn;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzib;->zzb:Lp51;

    .line 2
    .line 3
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/recaptcha/internal/zzhn;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final zzc(Lcom/google/android/recaptcha/internal/zzxn;Lc10;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/recaptcha/internal/zzcg;
        }
    .end annotation

    .line 1
    new-instance p2, Lcom/google/android/recaptcha/internal/zzhv;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p0, p1, v0}, Lcom/google/android/recaptcha/internal/zzhv;-><init>(Lcom/google/android/recaptcha/internal/zzib;Lcom/google/android/recaptcha/internal/zzxn;Lc10;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/google/android/recaptcha/internal/zzhg;

    .line 8
    .line 9
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzhg;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
