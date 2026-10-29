.class public final Lci1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Lkx1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lty0;->a:Lty0;

    .line 5
    .line 6
    invoke-static {v0}, Lj13;->t(Lty0;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Laz0;->b:Lkx1;

    .line 10
    .line 11
    iput-object v0, p0, Lci1;->a:Lkx1;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    sget-object p0, Lo42;->b:Lm42;

    .line 2
    .line 3
    invoke-interface {p1}, Lkotlinx/serialization/encoding/Decoder;->o()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    sget-object v0, Lo42;->b:Lm42;

    .line 14
    .line 15
    new-instance v0, Ln42;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v0

    .line 21
    :goto_0
    invoke-static {p0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    sget-object p0, Lty0;->a:Lty0;

    .line 29
    .line 30
    invoke-static {p0}, Lj13;->t(Lty0;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Laz0;->a:Laz0;

    .line 34
    .line 35
    new-instance v0, Lgd;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, v1}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Decoder;->u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_1
    return-object p0
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    iget-object p0, p0, Lci1;->a:Lkx1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p2, Ljava/lang/Integer;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lty0;->a:Lty0;

    .line 9
    .line 10
    invoke-static {p0}, Lj13;->t(Lty0;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Laz0;->a:Laz0;

    .line 14
    .line 15
    invoke-interface {p1, p0, p2}, Lkotlinx/serialization/encoding/Encoder;->A(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of p0, p2, Ljava/util/List;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Lty0;->a:Lty0;

    .line 24
    .line 25
    invoke-static {p0}, Lj13;->t(Lty0;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Laz0;->a:Laz0;

    .line 29
    .line 30
    new-instance v0, Lgd;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p0, v1}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 34
    .line 35
    .line 36
    check-cast p2, Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p1, v0, p2}, Lkotlinx/serialization/encoding/Encoder;->A(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string p0, "Unexpected vendors array serialization"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
