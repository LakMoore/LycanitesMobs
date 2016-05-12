package lycanite.lycanitesmobs.api.block;

import lycanite.lycanitesmobs.api.info.GroupInfo;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidBase extends BlockFluidClassic {
    public String blockName;
    public GroupInfo group;

    // ==================================================
    //                   Constructor
    // ==================================================
    public BlockFluidBase(Fluid fluid, Material material, GroupInfo group, String blockName) {
        super(fluid, material);
        this.blockName = blockName;
        this.group = group;
        this.setRegistryName(new ResourceLocation(this.group.filename, this.blockName));
        this.setUnlocalizedName(this.blockName);

        this.setRenderLayer(BlockRenderLayer.TRANSLUCENT);
    }


    // ==================================================
    //                      Visuals
    // ==================================================
    @Override
    public EnumBlockRenderType getRenderType(IBlockState blockState) {
        return EnumBlockRenderType.MODEL;
    }
}
