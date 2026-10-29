.class public final Lfc2;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Ljc2;

.field public b:Z

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljc2;

.field public e:I


# direct methods
.method public constructor <init>(Ljc2;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfc2;->d:Ljc2;

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
    iput-object p1, p0, Lfc2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lfc2;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lfc2;->e:I

    .line 9
    .line 10
    iget-object p1, p0, Lfc2;->d:Ljc2;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Ljc2;->f(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lz10;->a:Lz10;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p1, Lo42;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method
