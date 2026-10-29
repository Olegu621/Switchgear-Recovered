.class public final Lvp0;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lwp0;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lwp0;

.field public d:I


# direct methods
.method public constructor <init>(Lwp0;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvp0;->c:Lwp0;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lvp0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lvp0;->d:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lvp0;->d:I

    .line 9
    .line 10
    iget-object p1, p0, Lvp0;->c:Lwp0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lwp0;->b(Ld10;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lz10;->a:Lz10;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance p1, Lo42;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method
