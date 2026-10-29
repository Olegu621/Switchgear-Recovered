.class public final Lz11;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final a:Lz11;

.field public static final b:Ly11;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz11;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz11;->a:Lz11;

    .line 7
    .line 8
    sget-object v0, Ly11;->b:Ly11;

    .line 9
    .line 10
    sput-object v0, Lz11;->b:Ly11;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Ljb1;->f(Lkotlinx/serialization/encoding/Decoder;)Lj11;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lkotlinx/serialization/json/c;

    .line 5
    .line 6
    sget-object v0, Lrh2;->a:Lrh2;

    .line 7
    .line 8
    invoke-static {v0}, Lj13;->u(Lrh2;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lvh2;->a:Lvh2;

    .line 12
    .line 13
    sget-object v1, Ln11;->a:Ln11;

    .line 14
    .line 15
    new-instance v2, Lrt0;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, v0, v1, v3}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p1}, Lh;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/Map;

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lz11;->b:Ly11;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lkotlinx/serialization/json/c;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljb1;->g(Lkotlinx/serialization/encoding/Encoder;)Lp11;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lrh2;->a:Lrh2;

    .line 10
    .line 11
    invoke-static {p0}, Lj13;->u(Lrh2;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lvh2;->a:Lvh2;

    .line 15
    .line 16
    sget-object v0, Ln11;->a:Ln11;

    .line 17
    .line 18
    new-instance v1, Lrt0;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, p0, v0, v2}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Lrt0;->serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
