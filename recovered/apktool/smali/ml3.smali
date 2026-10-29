.class public final Lml3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:I

.field public final b:Ljava/util/ArrayList;

.field public c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

.field public d:Ljava/lang/String;

.field public e:Lnl3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1110

    .line 5
    .line 6
    iput v0, p0, Lml3;->a:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lml3;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lml3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 17
    .line 18
    iput-object v0, p0, Lml3;->d:Ljava/lang/String;

    .line 19
    .line 20
    sget-object v0, Lnl3;->d:Lnl3;

    .line 21
    .line 22
    iput-object v0, p0, Lml3;->e:Lnl3;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()Lin3;
    .locals 6

    .line 1
    new-instance v0, Lin3;

    .line 2
    .line 3
    iget v1, p0, Lml3;->a:I

    .line 4
    .line 5
    iget-object v3, p0, Lml3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 6
    .line 7
    iget-object v4, p0, Lml3;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lml3;->e:Lnl3;

    .line 10
    .line 11
    iget-object v2, p0, Lml3;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lin3;-><init>(ILjava/util/ArrayList;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Ljava/lang/String;Lnl3;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
