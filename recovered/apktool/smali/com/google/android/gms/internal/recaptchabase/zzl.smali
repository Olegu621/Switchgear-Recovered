.class public final Lcom/google/android/gms/internal/recaptchabase/zzl;
.super Lor0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lz02;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B%\u0008\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nB\u0011\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u000bJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/google/android/gms/recaptchabase/internal/InternalRecaptchaBaseClient;",
        "Lor0;",
        "La9;",
        "Lz02;",
        "Landroid/content/Context;",
        "context",
        "Lw8;",
        "Lcom/google/android/gms/recaptchabase/internal/RecaptchaBaseClientImpl;",
        "clientBuilder",
        "<init>",
        "(Landroid/content/Context;Lw8;)V",
        "(Landroid/content/Context;)V",
        "Lcom/google/android/gms/recaptchabase/ExecuteRequest;",
        "executeRequest",
        "Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/recaptchabase/ExecuteResult;",
        "execute",
        "(Lcom/google/android/gms/recaptchabase/ExecuteRequest;)Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/recaptchabase/InitRequest;",
        "initRequest",
        "Lcom/google/android/gms/recaptchabase/InitResult;",
        "init",
        "(Lcom/google/android/gms/recaptchabase/InitRequest;)Lcom/google/android/gms/tasks/Task;",
        "Companion",
        "java.com.google.android.gmscore.integ.client.recaptchabase_recaptchabase_kt"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Lcom/google/android/gms/internal/recaptchabase/zzi;

.field private static final zzc:Le9;

.field private static final zzd:Lh9;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/recaptchabase/zzi;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/recaptchabase/zzi;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/recaptchabase/zzl;->zzb:Lcom/google/android/gms/internal/recaptchabase/zzi;

    .line 7
    .line 8
    new-instance v1, Le9;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/recaptchabase/zzl;->zzc:Le9;

    .line 14
    .line 15
    new-instance v2, Lh9;

    .line 16
    .line 17
    const-string v3, "RecaptchaBase.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v0, v1}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/recaptchabase/zzl;->zzd:Lh9;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v3, Lcom/google/android/gms/internal/recaptchabase/zzl;->zzd:Lh9;

    .line 5
    .line 6
    sget-object v5, Lnr0;->c:Lnr0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    sget-object v4, Lb9;->g:La9;

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    move-object v1, p1

    .line 13
    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final execute(Lcom/google/android/gms/recaptchabase/ExecuteRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/recaptchabase/ExecuteRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/recaptchabase/ExecuteResult;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lpg3;->d:Lcom/google/android/gms/common/Feature;

    .line 9
    .line 10
    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, v0, Ltm2;->c:[Lcom/google/android/gms/common/Feature;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/internal/recaptchabase/zzg;

    .line 17
    .line 18
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/recaptchabase/zzg;-><init>(Lcom/google/android/gms/recaptchabase/ExecuteRequest;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 22
    .line 23
    const p1, 0x84d2

    .line 24
    .line 25
    .line 26
    iput p1, v0, Ltm2;->d:I

    .line 27
    .line 28
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public final init(Lcom/google/android/gms/recaptchabase/InitRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/recaptchabase/InitRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/recaptchabase/InitResult;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lpg3;->e:Lcom/google/android/gms/common/Feature;

    .line 9
    .line 10
    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, v0, Ltm2;->c:[Lcom/google/android/gms/common/Feature;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/internal/recaptchabase/zzh;

    .line 17
    .line 18
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/recaptchabase/zzh;-><init>(Lcom/google/android/gms/recaptchabase/InitRequest;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 22
    .line 23
    const p1, 0x84d1

    .line 24
    .line 25
    .line 26
    iput p1, v0, Ltm2;->d:I

    .line 27
    .line 28
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-object p0
.end method
