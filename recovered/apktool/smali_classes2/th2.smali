.class public final Lth2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final b:Lth2;


# instance fields
.field public final a:Lgd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lth2;

    .line 2
    .line 3
    invoke-direct {v0}, Lth2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lth2;->b:Lth2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lrh2;->a:Lrh2;

    .line 2
    .line 3
    invoke-static {v0}, Lj13;->u(Lrh2;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lvh2;->a:Lvh2;

    .line 7
    .line 8
    new-instance v1, Lgd;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lth2;->a:Lgd;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Ljb1;->f(Lkotlinx/serialization/encoding/Decoder;)Lj11;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lj11;->m()Lkotlinx/serialization/json/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1}, Lj11;->d()Lb11;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v1, v0, Lkotlinx/serialization/json/a;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lkotlinx/serialization/json/a;

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {v1, v0}, Lkotlinx/serialization/json/a;-><init>(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lth2;->a:Lgd;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    instance-of v1, v0, Lkotlinx/serialization/json/c;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance v1, Le21;

    .line 43
    .line 44
    check-cast v0, Lkotlinx/serialization/json/c;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, p1, v0, v2, v2}, Le21;-><init>(Lb11;Lkotlinx/serialization/json/c;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance v1, Lf21;

    .line 52
    .line 53
    check-cast v0, Lkotlinx/serialization/json/a;

    .line 54
    .line 55
    invoke-direct {v1, p1, v0}, Lf21;-><init>(Lb11;Lkotlinx/serialization/json/a;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {v1, p0}, Ln;->u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    iget-object p0, p0, Lth2;->a:Lgd;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgd;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljb1;->g(Lkotlinx/serialization/encoding/Encoder;)Lp11;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lp11;->d()Lb11;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lth2;->a:Lgd;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v1, Lh22;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lc21;

    .line 26
    .line 27
    new-instance v3, Lo;

    .line 28
    .line 29
    const/16 v4, 0x13

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-direct {v2, v0, v3, v4}, Lc21;-><init>(Lb11;Lkotlin/jvm/functions/Function1;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p0, p2}, Lc21;->A(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v1, Lh22;->a:Ljava/lang/Object;

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    check-cast p0, Lkotlinx/serialization/json/b;

    .line 46
    .line 47
    invoke-interface {p1, p0}, Lp11;->w(Lkotlinx/serialization/json/b;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const-string p0, "result"

    .line 52
    .line 53
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0
.end method
