.class public final Lfl1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ldr;
.implements Le63;


# instance fields
.field public final a:Ler;

.field public final synthetic b:Lgl1;


# direct methods
.method public constructor <init>(Lgl1;Ler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfl1;->b:Lgl1;

    .line 5
    .line 6
    iput-object p2, p0, Lfl1;->a:Ler;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ls82;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfl1;->a:Ler;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ler;->a(Ls82;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lr4;
    .locals 2

    .line 1
    check-cast p1, Lkotlin/Unit;

    .line 2
    .line 3
    new-instance p2, Lel1;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iget-object v1, p0, Lfl1;->b:Lgl1;

    .line 7
    .line 8
    invoke-direct {p2, v1, p0, v0}, Lel1;-><init>(Lgl1;Lfl1;I)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lfl1;->a:Ler;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Ler;->G(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lr4;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object p1, Lgl1;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object p0
.end method

.method public final d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    check-cast p1, Lkotlin/Unit;

    .line 2
    .line 3
    sget-object p2, Lgl1;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object v1, p0, Lfl1;->b:Lgl1;

    .line 7
    .line 8
    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lel1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, v1, p0, v0}, Lel1;-><init>(Lgl1;Lfl1;I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lfl1;->a:Ler;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Ler;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfl1;->a:Ler;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ler;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lfl1;->a:Ler;

    .line 2
    .line 3
    iget-object p0, p0, Ler;->e:Lkotlin/coroutines/CoroutineContext;

    .line 4
    .line 5
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfl1;->a:Ler;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
