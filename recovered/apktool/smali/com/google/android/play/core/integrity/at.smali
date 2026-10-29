.class final Lcom/google/android/play/core/integrity/at;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private final a:Lma3;

.field private final b:Lma3;


# direct methods
.method public constructor <init>(Lma3;Lma3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/play/core/integrity/at;->a:Lma3;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/play/core/integrity/at;->b:Lma3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lz93;)Lcom/google/android/play/core/integrity/as;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/at;->a:Lma3;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/play/core/integrity/as;

    .line 4
    .line 5
    invoke-interface {v0}, Lma3;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/play/core/integrity/at;->b:Lma3;

    .line 16
    .line 17
    invoke-interface {p0}, Lma3;->a()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v3, p0

    .line 22
    check-cast v3, Lcom/google/android/play/core/integrity/k;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v4, p1

    .line 34
    move-object v5, p2

    .line 35
    move-object v6, p3

    .line 36
    invoke-direct/range {v1 .. v6}, Lcom/google/android/play/core/integrity/as;-><init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/k;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lz93;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method
