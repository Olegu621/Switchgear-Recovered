.class final Lcom/google/android/recaptcha/internal/zzcu;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field zza:J

.field zzb:D

.field zzc:Ljava/lang/Object;

.field zzd:I

.field zze:I

.field synthetic zzf:Ljava/lang/Object;

.field final synthetic zzg:Lcom/google/android/recaptcha/internal/zzcx;

.field zzh:I

.field zzi:Lg22;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzcx;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzg:Lcom/google/android/recaptcha/internal/zzcx;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ld10;-><init>(Lc10;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzf:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzg:Lcom/google/android/recaptcha/internal/zzcx;

    .line 11
    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    move-object v9, p0

    .line 21
    invoke-virtual/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzcx;->zza(IJJDLkotlin/jvm/functions/Function1;Lc10;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
