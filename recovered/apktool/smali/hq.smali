.class public final Lhq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ly42;


# instance fields
.field public final synthetic b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lhq;->b:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lhq;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b(Lbd;)Lx42;
    .locals 0

    .line 1
    iget p0, p1, Lbd;->a:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    sget-object p0, Lx42;->d:Lx42;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object p0, Lx42;->e:Lx42;

    .line 10
    .line 11
    return-object p0
.end method
